package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel = "Nokia";
		float  mobileWeight = 2.5f;
		System.out.println("Mobile Model:" +mobileModel);
		System.out.println("Mobile Model:" +mobileWeight);
	}
	public void sendMsg() {
		Boolean isFullCharged = true;
		int mobileCost = 24000;
		System.out.println("Full Charged:" +isFullCharged);
		System.out.println("Mobile Cost:" +mobileCost);
	}
	public static void main(String[] args) {
		
		Mobile M1 = new Mobile();
		M1.makeCall();
		M1.sendMsg();
		System.out.println("This is my mobile");
	}
}
