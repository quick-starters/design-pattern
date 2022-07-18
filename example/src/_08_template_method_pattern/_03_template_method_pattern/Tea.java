package _08_template_method_pattern._03_template_method_pattern;

public class Tea extends CaffeineBeverage {

    protected void brew() {
        System.out.println("찻잎을 우려내는 중");

    }

    protected void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
