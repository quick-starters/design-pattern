package _04_factory_pattern._03_factory_diversify;

import _04_factory_pattern._03_factory_diversify.pizzafactory.NYPizzaFactory;
import _04_factory_pattern._03_factory_diversify.pizzafactory.WrongPizzaFactory;

public class Application {
    public static void main(String[] args) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
        nyStore.orderPizza("Veggie");

        WrongPizzaFactory wrongPizzaFactory = new WrongPizzaFactory();
        PizzaStore wrongPizzaStore = new PizzaStore(wrongPizzaFactory);
        wrongPizzaStore.orderPizza("pepperoni");
    }
}
