import java.util.Scanner;

public class arithmetic {
	public static void main(String s[]) {
		arithmetic a = new arithmetic();
		
		try 
		{
		a.divi();
	}
		catch (ArithmeticException ae) 
		{
		System.out.println(" I got the exception : " + ae.getMessage());
	    }
		try {
			a.str();
		} catch (Exception e) {
			System.out.println("convert"+e.getMessage());
		}
		}

	public void divi() throws ArithmeticException{
		int i = 0;
		i = 50 / 0;	
		System.out.println(i);

	}
	public void str()throws NumberFormatException
	{
		String s1="A";
		String s2="20";
		int b =Integer.parseInt(s1);
		int c=Integer.parseInt(s2);
	}
}

