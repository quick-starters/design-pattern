package _06_command_pattern._02_remotecontrol;

import _06_command_pattern._01_example.Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on;
        stereo.setCD;
        stereo.setVolume(1);
    }
}
