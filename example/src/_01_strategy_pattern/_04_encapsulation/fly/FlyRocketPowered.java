package _01_strategy_pattern._04_encapsulation.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("오리 로켓으로 날기!");
    }
}
