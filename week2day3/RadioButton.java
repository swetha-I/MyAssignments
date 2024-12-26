package week2day3;

public class RadioButton extends Button {

	
	public void selectRadioButton() {
		System.out.println("selectRadioButton");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton po=new RadioButton();
		po.selectRadioButton();
		po.submit();
		po.click();
		po.setText("text");


	}

}
