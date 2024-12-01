package designpatterninlambda.command;

public class CommandPatterInLambda {
	public static void main(String[] args) {
        // Receiver instances
        Light light = new Light();
        TV tv = new TV();
        
        // Invoker
        Invoker remote = new Invoker();

        // Lambda commands for Light
        Command lightOn = () -> light.turnOn();
        Command lightOff = () -> light.turnOff();
        
        // Lambda commands for TV
        Command tvOn = () -> tv.turnOn();
        Command tvOff = () -> tv.turnOff();
        Command changeChannel = () -> tv.changeChannel(5);
        
        // Using the remote to control the devices
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Light is ON
        
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Light is OFF
        
        remote.setCommand(tvOn);
        remote.pressButton();  // Output: TV is ON
        
        remote.setCommand(tvOff);
        remote.pressButton();  // Output: TV is OFF
        
        remote.setCommand(changeChannel);
        remote.pressButton();  // Output: Changing TV to channel 5
    }
}
