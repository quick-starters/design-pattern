package _04_factory_pattern._03_factory_diversify;

import _04_factory_pattern._03_factory_diversify.pizzafactory.NYPizzaFactory;
import _04_factory_pattern._03_factory_diversify.pizzafactory.WrongPizzaFactory;

public class Application {
    public static void main(String[] args) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
        nyStore.orderPizza("Veggie");

        // CHECK : 피자만드는 순서는 같지만, 피자가 잘못 만들어지는 경우가 생긴다.
        WrongPizzaFactory wrongPizzaFactory = new WrongPizzaFactory();
        PizzaStore wrongPizzaStore = new PizzaStore(wrongPizzaFactory);
        wrongPizzaStore.orderPizza("pepperoni");
    }
}
