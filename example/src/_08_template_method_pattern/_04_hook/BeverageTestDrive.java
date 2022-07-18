package _08_template_method_pattern._04_hook;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("커피 준비 중...");
        coffeeWithHook.prepareRecipe();
    }
}
