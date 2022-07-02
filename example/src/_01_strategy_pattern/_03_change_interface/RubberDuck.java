package _01_strategy_pattern._03_change_interface;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑!");
    }

    @Override
    void display() {
        System.out.println("고무오리의 모습을 띄고 있다.");
    }
}
