package _01_strategy_pattern._02_add_fly;

public class DecoyDuck extends Duck {
    @Override
    public void quack() {
        // 아무것도 하지 않음
    }

    @Override
    protected void fly() {
        // 아무것도 하지 않음
    }

    @Override
    public void display() {
        System.out.println("고무오리의 모습을 띄고 있다.");
    }
}
