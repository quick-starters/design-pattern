package _04_factory_pattern._04_factory_method_pattern;

public abstract class PizzaStore {

	/**
	 * 팩토리 메소드
	 *
	 * @apiNote
	 * 구상 클래스 인스턴스를 하나의 객체가 전부 처리하는 방식에서, 일련의 서브 클래스가 처리하는 방식으로 변했다.
	 * 팩토리 메소드는 객체 생성을 서브 클래스에 캡슐화함으로서, 슈퍼클래스에 있는
	 * 클라이언트 코드와 서브클래스에 있는 객체 생성 코드를 분리할 수 있게한다.
	 */
	abstract Pizza createPizza(String item);

	/**
	 * 디자인 원칙
	 * - 추상화 된것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.
	 * @apiNote
	 * 구현보다는 인터페이스에 맞춰서 프로그래밍한다와 똑같다고 생각할 수 있다. 물론 비슷하지만
	 * 의존성 뒤집기 원칙에서는 추상화를 더 많이 강조한다. 이 원칙에는 고수준 구성 요소가
	 * 저수준 구성 요소에 의존하면 안되며, 항상 추상화에 의존하게 만들어야한다는 뜻을 담고있다.
	 * <br>
	 * - PizzaStore: 고수준 구성 요소<br>
	 * - Pizza: 저수준 구성 요소
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
