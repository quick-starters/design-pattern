package _01_strategy_pattern._03_change_interface;

public abstract class Duck {
    protected void swim() {
        System.out.println("어푸어푸!");
    }

    abstract void display();
}
