package _04_factory_pattern._03_factory_diversify;

import _04_factory_pattern._02_encapsulation.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();;
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
