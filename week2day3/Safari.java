package week2day3;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("readerModer");
	}
	
	public void fullScreenMode() {
		System.out.println("fullScreenMode");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari de=new Safari ();
		de.openURL();
		de.closeBrower();
		de.navigateBrowser();
		de.readerMode();
		de.fullScreenMode();

	}

}
