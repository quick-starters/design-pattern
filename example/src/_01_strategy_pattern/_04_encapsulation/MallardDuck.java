package _01_strategy_pattern._04_encapsulation;

import _01_strategy_pattern._04_encapsulation.fly.FlyWithWings;
import _01_strategy_pattern._04_encapsulation.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("청둥오리의 모습을 띄고 있다.");
    }
}
