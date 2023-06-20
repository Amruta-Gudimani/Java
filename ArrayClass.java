public class ArrayClass {
    public static void main(String[] args) {
        // Creating 10 arrays with literals
        int[] ages = {15, 20, 25, 30, 45};
        String[] names = {"Amruta", "Akshata", "siya", "shraddha", "Priya"};
        double[] salaries = {2500.50, 3000.75, 3500.25, 4000.80, 4500.90};
        boolean[] isMarried = {false, true, true, false, true};
        String[] cities = {"New York", "London", "Paris", "Tokyo", "Sydney"};
        int[] scores = {85, 92, 78, 90, 87};
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
        double[] weights = {65.2, 70.5, 68.7, 72.0, 67.9};
        boolean[] isEmployed = {true, false, true, true, false};
        String[] countries = {"India", "USA", "France", "Japan", "UK"};

        // Creating 10 arrays with the new keyword
        int[] ages = new int[5];
        int[] names = new int[5];
        String[] salaries = new String[5];
        String[] isMarried = new String[5];
        double[] cities = new double[5];
        int[] scores = new int[5];
        double[] fruits = new double[5];
        boolean[] weights = new boolean[5];
        String[] isEmployed = new String[5];
        boolean[] countries = new boolean[5];

        // Changing the values of 5 elements using a for loop
        for (int i = 0; i < 5; i++) {
            ages[i] += 5; 
            salaries[i] *= 1.1;
            scores[i] -= 5; 
            weights[i] += 2.5; 
            isEmployed[i] = !isEmployed[i]; 
        }

        // Printing the updated values of the arrays
        System.out.println("Updated values of meaningful arrays:");
        System.out.println("Ages: " + Arrays.toString(ages));
        System.out.println("Salaries: " + Arrays.toString(salaries));
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Weights: " + Arrays.toString(weights));
        System.out.println("Employment Status: " + Arrays.toString(isEmployed));
    }
}
