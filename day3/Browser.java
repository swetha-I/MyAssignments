package week1.day3;

public class Browser {
	
	public String launchBrowser(String browser)
	{
	System.out.println("browser launched Successfully");
	return browser;
	}
	
	 public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Browser br= new Browser();
		String le= br.launchBrowser("Chrome");
		System.out.println(le);
		br.loadUrl();
		
			
	}
}

