package _05_singleton_pattern._05_enum_singleton;

public enum ChocolateBoiler {
  UNIQUE_INSTANCE;

  private boolean empty;
  private boolean boiled;

  ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("fill...");
      // fill the boiler with a milk/chocolate mixture
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      // drain the boiled milk and chocolate
      empty = true;
      System.out.println("drain...");
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      // bring the contents to a boil
      boiled = true;
      System.out.println("boil...");
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
