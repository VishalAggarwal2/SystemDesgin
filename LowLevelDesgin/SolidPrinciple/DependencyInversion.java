// our class should depend on interaces rather than the concreate classes
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb turned on");
    }
}

class Switch {
    private LightBulb bulb = new LightBulb();

    public void operate() {
        bulb.turnOn();
    }
}

interface Switchable {
    void turnOn();
}

class LightBulbCorrect implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb turned on");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan turned on");
    }
}

class SwitchCorrect {
    private Switchable device;

    public SwitchCorrect(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}


public class DependencyInversion {
}
