package week3.day1;

public class Edge extends Browser {
	
	// Single Inheritance
	public void takeSnap() {
		System.out.println("Take a snap");
	}
	public void clearCookies() {
		System.out.println("Clear all Cookies");
	}
	public static void main(String[] args) {
		Edge E1 = new Edge();
		E1.openURL();
		E1.closeBrowser();
		E1.navigateBack();
		System.out.println(E1.browserName);
		System.out.println(E1.browserVersion);
		
	}
}


