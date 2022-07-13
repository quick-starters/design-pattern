package _05_singleton_pattern._02_chocolate;

public class SingletonChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static SingletonChocolateBoiler uniqueInstance;

  private SingletonChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static SingletonChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      System.out.println("Creating unique instance of Chocolate Boiler");
      uniqueInstance = new SingletonChocolateBoiler();
    }
    System.out.println("Returning instance of Chocolate Boiler");
    return uniqueInstance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      // fill the boiler with a milk/chocolate mixture
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      // drain the boiled milk and chocolate
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      // bring the contents to a boil
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
