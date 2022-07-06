package _03_decorator_pattern._01_example.coffee;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
