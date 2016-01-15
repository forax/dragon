package fr.umlv.dragon.rt;

public final class RTError extends java.lang.Error {
  private static final long serialVersionUID = 1757244513502081863L;

  public RTError(String message, Throwable cause) {
    super(message, cause);
  }

  public RTError(String message) {
    super(message);
  }

  public RTError(Throwable cause) {
    super(cause);
  }
}
