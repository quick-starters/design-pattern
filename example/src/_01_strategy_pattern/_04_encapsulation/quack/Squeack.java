package _01_strategy_pattern._04_encapsulation.quack;

public class Squeack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑삑!");
    }
}
