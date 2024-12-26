package week2day3;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("openIncognito");
	}

	public void clearCache() {
		System.out.println("clearCache");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chrome fr=new Chrome();
		fr.openURL();
		fr.closeBrower();
		fr.navigateBrowser();
		fr.openIncognito();
		fr.clearCache();
		
	}

}
