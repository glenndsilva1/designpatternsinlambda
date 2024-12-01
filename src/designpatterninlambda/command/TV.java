package designpatterninlambda.command;

class TV {
    void turnOn() {
        System.out.println("TV is ON");
    }

    void turnOff() {
        System.out.println("TV is OFF");
    }
    
    void changeChannel(int channel) {
        System.out.println("Changing TV to channel " + channel);
    }
}
