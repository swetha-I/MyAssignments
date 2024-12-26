package week2day3;



public class Polymorphism {
	
	public void reportStep1(String msg,String status) {
		System.out.println("message"+" "+"status");
	}
	
	public void reportStep2(String msg,String status,Boolean value) {
		System.out.println(msg+" "+status+" "+false);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism Ge=new Polymorphism();
		Ge.reportStep1("Hello All", "Welcome to the TestLeaf");
		Ge.reportStep2("Good evening All", "Good", false);
		

	}

}
