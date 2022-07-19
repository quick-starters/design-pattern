package _09_iterator_and_composite_pattern._01_iterator_pattern._03_java_util_iterator;

import _09_iterator_and_composite_pattern._01_iterator_pattern._01_before.MenuItem;
import java.util.Iterator;

class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

		System.out.println("메뉴\n----\n아침 메뉴");
		printMenuItem(pancakeIterator);

		System.out.println("\n점심 메뉴");
		printMenuItem(dinerIterator);
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
