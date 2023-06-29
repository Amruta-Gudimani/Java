public class Chair {
    private String name;
    private int age;
    private String address;
    private double salary;
    private boolean isEmployed;

    // Default constructor
    public Chair() {
        name = "Amruta";
        age = 23;
        address = "Belgum";
        salary = 50000.0;
        isEmployed = true;
    }

    // Parameterized constructor
    public Chair(String name, int age, String address, double salary, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.isEmployed = isEmployed;
    }

    // Getters and setters for the variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Chair obj1 = new Chair();
        System.out.println("Object 1:");
        System.out.println("Name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
        System.out.println("Address: " + obj1.getAddress());
        System.out.println("Salary: " + obj1.getSalary());
        System.out.println("Employed: " + obj1.isEmployed());
        System.out.println();

        // Creating an object using the parameterized constructor
        Chair obj2 = new Chair("Pruthvi", 24, "Belgum", 60000.0, true);
        System.out.println("Object 2:");
        System.out.println("Name: " + obj2.getName());
        System.out.println("Age: " + obj2.getAge());
        System.out.println("Address: " + obj2.getAddress());
        System.out.println("Salary: " + obj2.getSalary());
        System.out.println("Employed: " + obj2.isEmployed());
    }
}
