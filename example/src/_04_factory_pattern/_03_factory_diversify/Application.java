package _04_factory_pattern._03_factory_diversify;

public class Application {
    public static void main(String[] args) {
        // CHECK : 피자만드는 순서는 같지만, 각각 레시피가 달라질 수 있다.
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
        nyStore.orderPizza("Veggie");

        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoPizzaFactory);
        chicagoStore.orderPizza("Veggie");
    }
}
