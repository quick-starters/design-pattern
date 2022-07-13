package _05_singleton_pattern._04_efficient_thread_safe;

public class StaticSingleton {

  private static StaticSingleton uniqueInstance = new StaticSingleton();

  private StaticSingleton() {}

  public static StaticSingleton getInstance() {
    return uniqueInstance;
  }
}
