package week2day3;

public class API extends APIClient {
	
	public void sendRequest1 (String  endpoint) {
		System.out.println("endpoint");
	}
	
	public void sendRequest2(String endpoint, String  requestBody,Boolean value) {
		System.out.println("endpoint"+" "+"requestBody"+" "+false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		API he=new API();
		he.sendRequest1("endpoint");
		he.sendRequest2("endpoint","requestBody", false);
		
	
	}

}
