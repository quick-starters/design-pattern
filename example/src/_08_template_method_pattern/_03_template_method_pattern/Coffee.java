package _08_template_method_pattern._03_template_method_pattern;

public class Coffee extends CaffeineBeverage {

    protected void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    protected void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}
