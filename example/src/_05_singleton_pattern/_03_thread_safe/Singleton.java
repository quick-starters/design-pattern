package _05_singleton_pattern._03_thread_safe;

public class Singleton {
  private static Singleton uniqueInstance;

  private Singleton() {}

  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }

    return uniqueInstance;
  }
}
