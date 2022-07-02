package _01_strategy_pattern._03_change_interface;

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    void display() {
        System.out.println("빨간오리의 모습을 띄고 있다.");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다!");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥!");
    }
}
