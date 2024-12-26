package week2day3;

public class TextField extends WebElement {
	public void  getText() {
		System.out.println("getText");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TextField ui=new TextField();
ui.getText();
ui.click();
ui.setText("setText");
		
		
	}

}
