package _01_strategy_pattern._04_encapsulation.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("오리 날다!");
    }
}
