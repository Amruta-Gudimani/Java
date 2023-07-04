public class WashingMachineString {
    public static void main(String[] args) {
		
        // Creating strings using literals
		
        String brand = "Whirlpool";
		String voltage = "220V";
		String warranty = "3 years";
		String color = "Black";
		String model = "C600";
		String size = "10 kg";
		String waterLevel = "High";
		String delayStart = "No";
		String quality = "Good";
		String quickWash = "Yes";
		
		String name= new String("Sony");
		String capacity = new String("200V");
		String garranty = new String("5 years");
		String look = new String("Blue");
		String design = new String("D500");
		String weight = new String("15 kg");
		String works = new String("Low");
		String faster = new String("Yes");
		String rate = new String("Bad");
		String washable = new String("No");
		
		System.out.println("Length of brand: " + brand.length());
        System.out.println("Concatenation of voltage and warranty: " + voltage.concat(warranty));
        System.out.println("Substring from index 1 to 3 in color: " + color.substring(1, 3));
        System.out.println("Index of 's' in model: " + model.indexOf('D'));
        System.out.println("Replacing 'Good' with 'Bad' in quality: " + quality.replace("Good", "Bad"));
    }
}

		
		