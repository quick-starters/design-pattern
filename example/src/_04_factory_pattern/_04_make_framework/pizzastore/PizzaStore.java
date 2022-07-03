package _04_factory_pattern._04_make_framework.pizzastore;

import _04_factory_pattern._04_make_framework.pizza.Pizza;

public abstract class PizzaStore {
    public final Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();;
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
