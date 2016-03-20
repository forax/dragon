package fr.umlv.dragon.rt;

import java.util.AbstractList;
import java.util.ArrayList;

public final class Array<E> extends AbstractList<E> {
  private boolean frozen;
  private final ArrayList<E> list;
  
  private Array(ArrayList<E> list) {
    this.list = list;
  }
  
  public Array() {
    this(new ArrayList<>());
  }
  
  @Override
  public String toString() {
    return list.toString();
  }
  
  public Array<E> freeze() {
    frozen = true;
    return this;
  }
  
  @SafeVarargs
  public static <E> Array<E> of(E... elements) {
    Array<E> array = new Array<>();
    for(E element: elements) {
      array.append(element);
    }
    return array;
  }
  
  public Array<E> append(E element) {
    Utils.requireNonNull(element, "element");
    if (frozen) {
      throw Utils.newRTError("hash is frozen");
    }
    list.add(element);
    return this;
  }
  
  @Override
  public boolean add(E element) {
    append(element);
    return true;
  }
  
  public int length() {
    return list.size();
  }
  
  @Override
  public E get(int index) {
    if (index < 0) {
      throw new RTError("index < 0");
    }
    if (index >= list.size()) {
      throw new RTError("index >= length");
    }
    return list.get(index);
  }

  @Override
  public int size() {
    return list.size();
  }
}
