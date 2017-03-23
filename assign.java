import java.util.Scanner;


public class assign {

		public static void main(String s[])
		{
			assign a = new assign();
			a.nive();
		}
		
		
		public void nive()
		{
			int a[] = new int[3];
			int i;
			
			Scanner in=new Scanner(System.in);
			a[0]=in.nextInt();
			a[1]=in.nextInt();
			a[2]=in.nextInt();
			try
			{
			a[5]=in.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("not declared");
			}
			
			
			for(i=0;i<a.length;i++)
			{
				System.out.println("values"+a[i]);
			}
		}
		

	}


