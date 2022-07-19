package _09_iterator_and_composite_pattern._01_iterator_pattern._05_ocp_principle;

import _09_iterator_and_composite_pattern._01_iterator_pattern._01_before.MenuItem;
import _09_iterator_and_composite_pattern._01_iterator_pattern._03_java_util_iterator.Menu;
import java.util.Iterator;
import java.util.List;

public class Waitress {

  List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    Iterator<Menu> menuIterator = menus.iterator();
    while (menuIterator.hasNext()) {
      Menu menu = menuIterator.next();
      printMenuItem(menu.createIterator());
    }
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
