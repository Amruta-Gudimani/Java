public class WashingMachine{
	int price;
	int speed;
	String brand;
	String color;
	String quality;
	int timetaken;
	int noOfbuttons;
	int noOfblades;
	int size;
	int energyConsumption;
	int currentState;
	String quickWash;
	int sound;
	int warranty;
	String waterLevel;
	int model;
	boolean isFast;
	boolean doarLock;
	int detergentLevel;
	int delayStart;
	
	
	public WashingMachine(String brand , int price , int warranty, String color)
		{
			this.brand = brand;
			this.price = price;
			this.isFast = isFast;
			this.warranty = warranty;
			this.color = color;
		}
		
		public static void turnOn()
		{
		}
		
		public static void turnOff()
		{
		}
		
		public static void setSpeed()
		{
		}
		
		public static void setTemperature()
		{
		}
		
		public static void addDetergent()
		{
		}
		
		public static void wash()
		{
		}
		
		public static void addClothes()
		{
		}
		
		public static void rinse()
		{
		}
		
		public static void digitalDisplay()
		{
		}
		
		
		public static void main(String[] args)
		{
			WashingMachine washingMachine= new WashingMachine("Panasonic" , 20000 , 10, "Blue");
			System.out.println(washingMachine);
			System.out.println(washingMachine.brand);
			System.out.println(washingMachine.price);
			System.out.println(washingMachine.warranty);
			System.out.println(washingMachine.color);
		}
	
}
