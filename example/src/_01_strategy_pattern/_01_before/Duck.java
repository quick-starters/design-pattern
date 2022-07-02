package _01_strategy_pattern._01_before;

public abstract class Duck {
    protected void quack() {
        System.out.println("꽥꽥!");
    }

    protected void swim() {
        System.out.println("어푸어푸!");
    }

    abstract void display();
}
