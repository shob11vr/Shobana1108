package week3.day1;

public class LoginTestData extends TestData {
	// Single Inheritance
	public void enterUsername() {
		System.out.println("Enter the username");
	}
	public void enterPassword() {
		System.out.println("Enter the password");
	}

	public static void main(String[] args) {
		
		LoginTestData L1 = new LoginTestData();
		L1.enterCredentials();
		L1.enterPassword();
		L1.enterCredentials();
		L1.navigateToHomePage();
	}
}
