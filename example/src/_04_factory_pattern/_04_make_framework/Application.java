package _04_factory_pattern._04_make_framework;

public class Application {
    public static void main(String[] args) {
        /**
         * 생산자 클래스가 실제 생산될 제품을 전혀 모르는 상태로 만들어진다.
         * 사용하는 클래스에 따라 생산되는 객체 인스턴스가 결정된다.
         */
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
