package _01_strategy_pattern._04_encapsulation;

import _01_strategy_pattern._04_encapsulation.fly.FlyNoWay;
import _01_strategy_pattern._04_encapsulation.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
