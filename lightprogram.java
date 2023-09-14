class Light {

    public boolean isOn;

    public Light() {
        isOn = false; 
    }

    public void switchOn() {
        isOn = true;
        System.out.println("Light is turned on.");
    }

    public void switchOff() {
        isOn = false;
        System.out.println("Light is turned off.");
    }

    public boolean isLightOn() {
        return isOn;
    }
}

public class lightprogram {
    public static void main(String[] args) {
        Light led = new Light();
        Light halogen = new Light();

        led.switchOn();

        halogen.switchOff();

        System.out.println("Is LED light on? " + led.isLightOn());
        System.out.println("Is halogen light on? " + halogen.isLightOn());
    }
}
