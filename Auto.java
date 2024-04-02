package week3.day1;

public class Auto extends Vehicle {

	// Hierarchical vehicle has 2 child Car and Auto
	public void kickStart( ) {
		System.out.println("Kick Start");
	}
	
	public static void main(String[] args) {
		Auto obj2 = new Auto();
		obj2.applyBreak();
		obj2.soundHorn();
		obj2.kickStart();
	}
}

