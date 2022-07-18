package _08_template_method_pattern._03_template_method_pattern;

public abstract class CaffeineBeverage {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    }

    protected abstract void brew();

    protected void pourInCup() {
        System.out.println("컵에 따르는중");
    }

    protected abstract void addCondiments();
}
