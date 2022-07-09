package _03_decorator_pattern._01_example.coffee;

public class DeCaffein extends Beverage {

    public DeCaffein() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
