public class Telephone {

    public static void main(String[] args) {
        Telephone example = new Telephone();

        System.out.println("Sum: " + example.sum(5, 3));
        System.out.println("Absolute value: " + example.absoluteValue(-7));
        System.out.println("Maximum number: " + example.maximum(9, 12));
        System.out.println("Vowel or Consonant: " + example.checkVowel('e'));
        System.out.println("Grade: " + example.calculateGrade(85));
        System.out.println("Leap year: " + example.checkLeapYear(2020));
        System.out.println("BMI: " + example.calculateBMI(65, 1.75));
        System.out.println("Factorial: " + example.calculateFactorial(5));
        System.out.println("Palindrome: " + example.checkPalindrome("racecar"));
        System.out.println("Time of Day: " + example.checkTimeOfDay(14));
    }

    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }

    public int maximum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public String checkVowel(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    public String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean checkLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

  
    public boolean checkPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
	
    public String checkTimeOfDay(int hour) {
        if (hour >= 0 && hour < 12) {
            return "Morning";
        } else if (hour < 18) {
            return "Afternoon";
        } else {
            return "Evening";
        }
    }
}
