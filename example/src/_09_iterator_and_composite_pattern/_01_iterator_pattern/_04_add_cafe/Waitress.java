package _09_iterator_and_composite_pattern._01_iterator_pattern._04_add_cafe;

import _09_iterator_and_composite_pattern._01_iterator_pattern._01_before.MenuItem;
import _09_iterator_and_composite_pattern._01_iterator_pattern._03_java_util_iterator.Menu;
import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

		System.out.println("메뉴\n----\n아침 메뉴");
		printMenuItem(pancakeIterator);

		System.out.println("\n점심 메뉴");
		printMenuItem(dinerIterator);

		System.out.println("\n저녁 메뉴");
		printMenuItem(cafeIterator);
	}

	public void printMenuItem(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
