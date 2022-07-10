package _04_factory_pattern._04_factory_method_pattern;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Fake Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}
