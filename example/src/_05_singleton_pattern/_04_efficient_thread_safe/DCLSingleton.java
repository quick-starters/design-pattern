package _05_singleton_pattern._04_efficient_thread_safe;

public class DCLSingleton {
  private volatile static DCLSingleton uniqueInstance;

  private DCLSingleton() {}

  public static DCLSingleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (DCLSingleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new DCLSingleton();
        }
      }
    }

    return uniqueInstance;
  }
}
