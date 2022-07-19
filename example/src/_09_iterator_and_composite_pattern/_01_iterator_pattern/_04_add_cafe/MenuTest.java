package _09_iterator_and_composite_pattern._01_iterator_pattern._04_add_cafe;

import _09_iterator_and_composite_pattern._01_iterator_pattern._03_java_util_iterator.DinerMenu;
import _09_iterator_and_composite_pattern._01_iterator_pattern._03_java_util_iterator.PancakeHouseMenu;

public class MenuTest {

  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
    waitress.printMenu();
  }
}
