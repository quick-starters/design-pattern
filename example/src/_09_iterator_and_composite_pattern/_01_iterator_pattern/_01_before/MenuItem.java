package _09_iterator_and_composite_pattern._01_iterator_pattern._01_before;


public class MenuItem {
  String name;
  String description;
  boolean vegetarian;
  double price;

  public MenuItem(String name,
      String description,
      boolean vegetarian,
      double price)
  {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }
}

