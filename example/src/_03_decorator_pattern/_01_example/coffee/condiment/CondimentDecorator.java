package _03_decorator_pattern._01_example.coffee.condiment;

import _03_decorator_pattern._01_example.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
