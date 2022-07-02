package _01_strategy_pattern._02_add_fly;

public abstract class Duck {
    protected void quack() {
        System.out.println("꽥꽥!");
    }

    protected void swim() {
        System.out.println("어푸어푸!");
    }

    /**
     * CHECK: 오리가 날아야한다는 요구사항이 추가되었다.
     */
    protected void fly() {
        System.out.println("오리 날다!");
    }

    public abstract void display();
}
