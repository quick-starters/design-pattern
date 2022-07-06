package _03_decorator_pattern._01_example.coffee.condiment;

import _03_decorator_pattern._01_example.coffee.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
