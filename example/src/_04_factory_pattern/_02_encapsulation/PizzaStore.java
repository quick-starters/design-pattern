package _04_factory_pattern._02_encapsulation;

import _04_factory_pattern._02_encapsulation.pizza.Pizza;

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
