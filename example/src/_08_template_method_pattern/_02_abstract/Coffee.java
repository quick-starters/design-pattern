package _08_template_method_pattern._02_abstract;

public class Coffee extends CaffeineBeverage{

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMik();
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    private void addSugarAndMik() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}
