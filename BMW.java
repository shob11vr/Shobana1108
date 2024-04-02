package week3.day1;

public class BMW extends Car{
	
	public void openSunRoof() {
		System.out.println("Open Sun roof");
	}
	
	
	public static void main(String[] args) {
		BMW obj1 = new BMW();
		
	    obj1.openSunRoof();
		obj1.applyBreak();
		obj1.applyGear();
		obj1.soundHorn();
		obj1.switchOnAc();
		obj1.openSunRoof();
	}

}
