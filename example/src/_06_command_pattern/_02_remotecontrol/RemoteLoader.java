package _06_command_pattern._02_remotecontrol;

import _06_command_pattern._01_example.LightOnCommand;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Room");
        Stereos stereos = new Stereos("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);
        StereoOnWithCdCommand stereoOnWithCD = new StereoOnWithCdCommand(stereos);
        StereoOffCdCommand stereoOff = new StereoOffCdCommand(stereos);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        // 람다를 쓴다면,
        // remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
