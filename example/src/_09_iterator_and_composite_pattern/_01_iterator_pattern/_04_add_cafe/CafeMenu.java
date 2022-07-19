package _09_iterator_and_composite_pattern._01_iterator_pattern._04_add_cafe;

import _09_iterator_and_composite_pattern._01_iterator_pattern._01_before.MenuItem;
import _09_iterator_and_composite_pattern._01_iterator_pattern._03_java_util_iterator.Menu;
import java.util.*;

public class CafeMenu implements Menu {
	Map<String, MenuItem> menuItems = new HashMap<>();

	public CafeMenu() {
		addItem("베지 버거와 에어 프라이",
			"통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거",
			true, 3.99);
		addItem("오늘의 스프",
			"샐러드가 곁들여진 오늘의 스프",
			false, 3.69);
		addItem("부리토",
			"통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토",
			true, 4.29);
	}

	public void addItem(String name, String description,
	                     boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(name, menuItem);
	}

//	public Map<String, MenuItem> getMenuItems() {
//		return menuItems;
//	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}
