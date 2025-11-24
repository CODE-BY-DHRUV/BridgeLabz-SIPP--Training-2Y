interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}

class AirConditioner implements SmartDevice {
    public void turnOn() { System.out.println("AC turned ON"); }
    public void turnOff() { System.out.println("AC turned OFF"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV turned ON"); }
    public void turnOff() { System.out.println("TV turned OFF"); }
}

class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDevice d1 = new Light();
        SmartDevice d2 = new AirConditioner();
        SmartDevice d3 = new TV();
        d1.turnOn(); d2.turnOn(); d3.turnOff();
    }
}

