package week3.day1;

public class Chrome extends Browser {
	
	// Single level Inheritance

	public void openIncognito() {
		System.out.println("Open in Incognito");
	}
	public void clearCache() {
		System.out.println("Clear Cache");
	}
	public static void main(String[] args) {
		Chrome C1 = new Chrome();
		C1.openURL();
		C1.closeBrowser();
		C1.openIncognito();
		C1.navigateBack();
		C1.clearCache();
		System.out.println(C1.browserName);
		System.out.println(C1.browserVersion);
	}
}

