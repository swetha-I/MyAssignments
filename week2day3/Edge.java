package week2day3;

public class Edge extends  Browser {

	public void takeSnap() {
		System.out.println("takeSnap");
	}
	public void  clearCookies() {
		System.out.println("clearCookies");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Edge Se=new Edge();
Se.openURL();
Se.closeBrower();
Se.navigateBrowser();
Se.takeSnap();
Se.clearCookies();
	}

}
