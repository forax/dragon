package fr.umlv.dragon.rt;

import static fr.umlv.dragon.rt.Utils.requireNonNull;
import static java.util.stream.Collectors.joining;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public final class Dict extends AbstractMap<String, Object> {
  final HashMap<String, Object> map = new HashMap<>();
  final Array<String> keys = new Array<>();
  private boolean frozen;
  
  private transient Set<Map.Entry<String, Object>> entrySet;
  private transient Set<String> keySet;
  
  public static Dict of(Object... elements) {
    Dict dict = new Dict();
    for(int i = 0; i < elements.length; i+=2) {
      dict.append(elements[i].toString(), elements[i + 1]);
    }
    return dict;
  }
  
  @Override
  public String toString() {
    return keys.stream()
        .map(k -> k + ": " + map.get(k))
        .collect(joining(",\n", "{\n", "\n}"));
  }
  
  public Dict freeze() {
    frozen = true;
    return this;
  }
  
  public Dict append(String key, Object value) {
    requireNonNull(key, "key");
    requireNonNull(value, "value");
    if (frozen) {
      throw Utils.newRTError("hash is frozen");
    }
    if (map.put(key, value) != null) {
      throw new RTError("key " + key + " already defined");
    }
    keys.add(key);
    return this;
  }
  
  @Override
  public Object put(String key, Object value) {
    append(key, value);
    return null;
  }
  
  @Override
  public Object get(Object key) {
    requireNonNull(key, "key");
    Object value = map.get(key);
    if (value == null) {
      throw new RTError("no key " + key);
    }
    return value;
  }
  
  @Override
  public Object getOrDefault(Object key, Object defaultValue) {
    Utils.requireNonNull(key, "key");
    Object value = map.get(key);
    if (value == null) {
      return defaultValue;
    }
    return value;
  }
  @Override
  public boolean containsKey(Object key) {
    return map.containsKey(key);
  }
  @Override
  public boolean containsValue(Object value) {
    return map.containsValue(value);
  }
  
  @Override
  public Set<Map.Entry<String, Object>> entrySet() {
    if (entrySet != null) {
      return entrySet;
    }
    return entrySet = new AbstractSet<Map.Entry<String, Object>>() {
      @Override
      public int size() {
        return keys.size();
      }
      @Override
      public Iterator<Map.Entry<String, Object>> iterator() {
        Iterator<String> it = keys.iterator();
        return new Iterator<Map.Entry<String, Object>>() {
          @Override
          public boolean hasNext() {
            return it.hasNext();
          }

          @Override
          public Map.Entry<String, Object> next() {
            String key = it.next();
            return new AbstractMap.SimpleImmutableEntry<>(key, map.get(key));
          }
        };
      }
    };
  }
  
  @Override
  public void forEach(BiConsumer<? super String, ? super Object> action) {
    Utils.requireNonNull(action, "action");
    keys.forEach(key -> action.accept(key, map.get(key)));
  }
  
  @Override
  public Set<String> keySet() {
    if (keySet != null) {
      return keySet;
    }
    return keySet = new AbstractSet<String>() {
      @Override
      public int size() {
        return keys.size();
      }
      @Override
      public Iterator<String> iterator() {
        return keys.iterator();
      }
    };
  }
  
  public List<String> keys() {
    return keys;
  }
}
