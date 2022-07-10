package _06_command_pattern._02_remotecontrol;

import _06_command_pattern._01_example.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
