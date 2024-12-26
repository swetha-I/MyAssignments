package week2day3;

public class WebElement {
	
	public void click() {
		System.out.println("Click");
	}
	
	public void  setText(String text) {
		System.out.println("setText");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement tr= new WebElement();
		tr.click();
		tr.setText("text");
		
		
	}

}
