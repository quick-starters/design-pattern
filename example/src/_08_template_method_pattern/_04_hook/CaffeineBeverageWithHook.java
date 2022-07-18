package _08_template_method_pattern._04_hook;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantscondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("컵에 따르는중");
    }

    protected abstract void addCondiments();

    protected boolean customerWantscondiments() {
        return true;
    }
}
