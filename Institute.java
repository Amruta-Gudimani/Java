public class Institute {

    	public static float getSomthing(int value1 , int value2){
		return value1;
	}
	
	public static float getSomthing(int value1 , int value2 , int g3){
		return value1*value2;
	}
	
	public static float getSomthing(int value1 , float value2){
		return value1-value2;
	}
	
	public static float getSomthing(float value1 , float value2){
		return value1*value2;
	}
	
	public static float getSomthing(short value1 , double value2){
		return value1;
	}
	
	public static float getSomthing(double value1 , short value2){
		return value2;
	}
	
        public int multiply(int a, int b) {
        	return a * b;
    	}	
	
	public double multiply(double a, double b) {
       		return a * b;
    	}
	
	public int multiply(int a, int b, int c) {
        	return a * b * c;
    	}
	
	public double multiply(double a, double b, double c) {
        	return a * b * c;
        }
    
        public boolean isPositive(int num) {
        	return num > 0;
        }
     
    	public boolean isNegative(int num) {
       	       return num < 0;
    	}
    
    	public boolean isZero(int num) {
               return num == 0;
   	}
    
    	public boolean isEven(int num) {
               return num % 2 == 0;
   	}
	
	public boolean isOdd(int num) {
               return num % 2 != 0;
    	}
    
        public int subtract(int a, int b) {
               return a - b;
   	}
    
   	public double subtract(double a, double b) {
               return a - b;
   	}
	
	public int subtract(int a, int b, int c) {
               return a - b - c;
        }
    
    
    	public double subtract(double a, double b, double c) {
               return a - b - c;
        }
    
        public boolean isPrime(int num) {
         if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Institute myObject = new Institute();
        
        float result = getSomthing(3,4);  
	System.out.println(result);
		
	float result1 = getSomthing(3,4,6);  
	System.out.println(result1);
		
	float result2 = getSomthing(3,4.8f);  
	System.out.println(result2);
		
	float result3 = getSomthing(3.3f,4.4f);  
	System.out.println(result3);
		
	float result4 = getSomthing((short)3,4.76d);  
	System.out.println(result4);
		
	float result5 = getSomthing(3.78d,(short)4);  
	System.out.println(result5);
		
	int product1 = myObject.multiply(4, 6);
        System.out.println("Product of 4 and 6: " + product1);
 
        double product2 = myObject.multiply(1.5, 2.5);
        System.out.println("Product of 1.5 and 2.5: " + product2);
        
        int product3 = myObject.multiply(1, 2, 3);
        System.out.println("Product of 1, 2, and 3: " + product3);
		
	double product4 = myObject.multiply(1.1, 2.2, 3.3);
        System.out.println("Product of 1.1, 2.2, and 3.3: " + product4);
        
        boolean isZero1 = myObject.isZero(0);
        System.out.println("Is 0 zero? " + isZero1);
		
	boolean isPositive1 = myObject.isPositive(10);
        System.out.println("Is 10 positive? " + isPositive1);
		
	boolean isNegative1 = myObject.isNegative(-5);
        System.out.println("Is -5 negative? " + isNegative1);
       
        boolean isEven1 = myObject.isEven(7);
        System.out.println("Is 7 even? " + isEven1);
		
	boolean isOdd1 = myObject.isOdd(9);
        System.out.println("Is 9 odd? " + isOdd1);
		
	boolean isPrime1 = myObject.isPrime(17);
        System.out.println("Is 17 prime? " + isPrime1);
		
        int difference1 = myObject.subtract(10, 4);
        System.out.println("Difference between 10 and 4: " + difference1);
   
        double difference2 = myObject.subtract(5.8, 2.3);
        System.out.println("Difference between 5.8 and 2.3: " + difference2);

        int difference3 = myObject.subtract(15, 7, 2);
        System.out.println("Difference between 15, 7, and 2: " + difference3);
        
        double difference4 = myObject.subtract(9.5, 3.2, 1.1);
        System.out.println("Difference between 9.5, 3.2, and 1.1: " + difference4);
    }
}
