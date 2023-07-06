public class Television {
    // Static variables
    private static String manufacturer;
    private static String model;
    private static int screenSize;
    private static boolean isSmartTV;
    private static int yearOfManufacture;

    // Non-static variables
    private String resolution;
    private int price;
    private boolean isOn;
    private int currentChannel;
    private int volumeLevel;

    // Static block to initialize static variables
    static {
        manufacturer = "Samsung";
        model = "XYZ123";
        screenSize = 42;
        isSmartTV = true;
        yearOfManufacture = 2022;
    }

    // Constructor to initialize non-static variables
    public Television(String resolution, int price) {
        this.resolution = resolution;
        this.price = price;
        isOn = false;
        currentChannel = 1;
        volumeLevel = 10;
    }

    // Main method to create objects and test the class
    public static void main(String[] args) {
        Television tv1 = new Television("1080p", 1000);
        Television tv2 = new Television("4K", 2000);
        Television tv3 = new Television("720p", 500);
        Television tv4 = new Television("1080p", 1500);
        Television tv5 = new Television("4K", 2500);

        // Display the details of each TV object
        System.out.println("Television 1:");
        displayDetails(tv1);
        System.out.println();

    }

    // Method to display the details of a TV object
    public static void displayDetails(Television tv) {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Smart TV: " + isSmartTV);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Resolution: " + tv.resolution);
        System.out.println("Price: $" + tv.price);
        System.out.println("Is On: " + tv.isOn);
        System.out.println("Current Channel: " + tv.currentChannel);
        System.out.println("Volume Level: " + tv.volumeLevel);
    }
}
