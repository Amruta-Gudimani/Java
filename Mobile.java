public class Mobile {
    public static void main(String[] args) {
		turnOn();
	}
	
	public static void turnOn(){
		
		Long accNo = 58595859L;
		
		if(accNo>0){
			System.out.println("Acc no is greater than 0");
			return;
		}
		
		else{
			System.out.println("Acc no is lesser than 0");
		}
		
		System.out.println("came out of else");
	}
}