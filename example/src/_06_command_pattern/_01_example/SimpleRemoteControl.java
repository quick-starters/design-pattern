package _06_command_pattern._01_example;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPreseed() {
        slot.execute();
    }
}
