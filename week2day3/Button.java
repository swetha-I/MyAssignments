package week2day3;

public class Button extends WebElement {
	
	public void  submit() {
		System.out.println("sumbit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button yr=new Button();
		yr.submit();
		yr.click();
		yr.setText("text");
		
		
	}

}
