package _04_factory_pattern._03_factory_diversify.pizza;

public class WrongPepperoniPizza implements Pizza {
    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {
        System.out.println("피자 자르는 것을 까먹었다!");
    }

    @Override
    public void box() {

    }
}
