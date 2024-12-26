package week1.day3;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="I am a software tester";
	
		String Val="software";
		char[] ch= Val.toCharArray();
		for (int i= ch.length-1;i>=0;i--) 
		{
			System.out.print(ch[i]);
		}
		

	}

}
