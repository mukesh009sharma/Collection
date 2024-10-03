//Q1.Create a RemoteControl interface with methods turnOn() and turnOff(). Implement this interface in TV and Fan classes, showing how they can be controlled using these methods. 
// collection questions
interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("The TV is now ON.");
    }

    public void turnOff() {
        System.out.println("The TV is now OFF.");
    }
}

class Fan implements RemoteControl {
    public void turnOn() {
        System.out.println("The Fan is now ON.");
    }

    public void turnOff() {
        System.out.println("The Fan is now OFF.");
    }
}

public class Main {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        RemoteControl fan = new Fan();

        tv.turnOn();
        fan.turnOn();

        tv.turnOff();
        fan.turnOff();
    }
}
