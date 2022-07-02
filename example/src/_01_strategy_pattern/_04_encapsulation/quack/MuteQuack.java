package _01_strategy_pattern._04_encapsulation.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // 아무것도 하지 않음
    }
}
