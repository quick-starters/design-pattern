package _04_factory_pattern._01_before;

public class PizzaStore {
    public Pizza orderPizza(String type) throws Exception {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            throw new Exception("잘못된 피자 타입입니다");
        }

        pizza.prepare();;
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
