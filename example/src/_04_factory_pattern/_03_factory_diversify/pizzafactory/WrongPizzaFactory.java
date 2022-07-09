package _04_factory_pattern._03_factory_diversify.pizzafactory;

import _04_factory_pattern._03_factory_diversify.pizza.*;

public class WrongPizzaFactory implements PizzaFactory {
    public _04_factory_pattern._03_factory_diversify.pizza.Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new WrongPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
