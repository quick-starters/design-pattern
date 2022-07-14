package _04_factory_pattern._03_factory_diversify;

import _04_factory_pattern._03_factory_diversify.pizza.Pizza;
import _04_factory_pattern._03_factory_diversify.pizzafactory.PizzaFactory;

public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        // CHECK: 자세한 구현이 Pizza로 가 있어, 자르지 않는 경우가 생길 수 있다.
        pizza.prepare();;
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
