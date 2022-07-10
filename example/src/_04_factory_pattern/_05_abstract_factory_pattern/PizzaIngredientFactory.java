package _04_factory_pattern._05_abstract_factory_pattern;

import _04_factory_pattern._05_abstract_factory_pattern.ingredients.*;

/**
 * 추상 팩토리
 * @implNote
 * 제품군을 만들 수 있게 해준다. 팩토리 메소드는 하나의 제품을 만든다면, 추상 팩토리는 객체 구성에 활용한다.
 * 구상 클래스에 직접 의존하지 않고도 서로 관련된 객체로 이루어진 제품군을 만드는 용도로 쓰인다.
 */
public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
