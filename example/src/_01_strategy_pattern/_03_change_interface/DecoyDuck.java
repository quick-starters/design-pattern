package _01_strategy_pattern._03_change_interface;

public class DecoyDuck extends Duck {
    @Override
    void display() {
        System.out.println("고무오리의 모습을 띄고 있다.");
    }
}
