package _04_factory_pattern._03_factory_diversify.pizzafactory;


import _04_factory_pattern._03_factory_diversify.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}

