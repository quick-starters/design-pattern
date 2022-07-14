package _07_01_adapter_pattern._02_adapter_pattern_01;

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
