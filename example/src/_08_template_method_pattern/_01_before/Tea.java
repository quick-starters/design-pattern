package _08_template_method_pattern._01_before;

public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void steepTeaBag() {
        System.out.println("찻잎을 우려내는 중");

    }

    private void pourInCup() {
        System.out.println("컵에 따르는중");
    }

    private void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }
}
