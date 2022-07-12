package _07_adapter_and_facade_pattern._02_adapter_pattern;

public class WildTurkey implements Turkey {
    @Override
    public void gooble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 날고 있어요!");
    }
}
