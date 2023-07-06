class Runner {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();
        Television tv4 = new Television();
        Television tv5 = new Television();

        // Accessing behaviors using static methods
        tv1.turnOn();
        tv2.changeChannel(5);
        tv3.increaseVolume();
        tv4.decreaseVolume();
        tv5.turnOff();
    }
}

class Television {
    // Static variables for states
    static boolean isOn;
    static int channel;
    static int volume;
    static String manufacturer;
    static String model;
    static boolean hasRemote;
    static boolean hasHDMI;
    static String color;
    static int screenSize;

    // Static block to initialize static variables
    static {
        isOn = false;
        channel = 1;
        volume = 50;
        manufacturer = "Sony";
        model = "Bravia";
        hasRemote = true;
        hasHDMI = true;
        color = "Black";
        screenSize = 40;
    }

    // Static methods for behaviors
    static void turnOn() {
        isOn = true;
        System.out.println("TV turned on.");
    }

    static void turnOff() {
        isOn = false;
        System.out.println("TV turned off.");
    }

    static void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel changed to " + newChannel);
    }

    static void increaseVolume() {
        volume += 10;
        System.out.println("Volume increased to " + volume);
    }

    static void decreaseVolume() {
        volume -= 10;
        System.out.println("Volume decreased to " + volume);
    }
}
