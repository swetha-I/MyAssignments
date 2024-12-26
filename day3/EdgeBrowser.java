package week1.day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser br= new Browser();
		String le= br.launchBrowser("Edge");
		System.out.print(le);
		br.loadUrl();
		
	
	}

}
