package _01_strategy_pattern._04_encapsulation.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥!");
    }
}
