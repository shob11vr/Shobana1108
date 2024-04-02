package week3.day1;

public class Car extends Vehicle{
	
	// Single level inheritance
	
	public void applyGear() {
		System.out.println("Apply gear");
	}
	
	public void switchOnAc(){
		System.out.println("Switch on AC");
	}
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyBreak();
		obj.soundHorn(); 
	}

}
