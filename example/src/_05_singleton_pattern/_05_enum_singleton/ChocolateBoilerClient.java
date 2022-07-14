package _05_singleton_pattern._05_enum_singleton;


public class ChocolateBoilerClient {

  public static void main(String[] args) {
    ChocolateBoiler chocolateBoiler = ChocolateBoiler.UNIQUE_INSTANCE;
    chocolateBoiler.fill();
    chocolateBoiler.boil();
    chocolateBoiler.drain();
    // 싱글턴 사용

    ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.UNIQUE_INSTANCE;
    chocolateBoiler.fill();
    chocolateBoiler.boil();
    chocolateBoiler.drain();

    System.out.println(chocolateBoiler.equals(chocolateBoiler2));
  }
}
