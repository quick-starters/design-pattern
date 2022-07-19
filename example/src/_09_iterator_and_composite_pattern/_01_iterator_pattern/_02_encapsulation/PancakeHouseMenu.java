package _09_iterator_and_composite_pattern._01_iterator_pattern._02_encapsulation;


import _09_iterator_and_composite_pattern._01_iterator_pattern._01_before.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
  // 메뉴 추가를 쉽게 하기 위해 ArrayList
  ArrayList<MenuItem> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<MenuItem>();

    addItem("K&B 팬케이크 세트",
        "스크램블 에그와 토스트가 곁들여진 팬케이크",
        true,
        2.99);

    addItem("레귤러 팬케이크 세트",
        "달걀 프라이와 소시지가 곁들여진 팬케이크",
        false,
        2.99);

    addItem("블루베리 팬케이크",
        "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크",
        true,
        3.49);

    addItem("와플",
        "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플",
        true,
        3.59);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public Iterator<MenuItem> createIterator() {
    return menuItems.iterator();
  }

}
