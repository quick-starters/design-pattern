package _08_template_method_pattern._02_abstract;

public abstract class CaffeineBeverage {

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    }

    protected void pourInCup() {
        System.out.println("컵에 따르는중");
    }
}
