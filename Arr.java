import java.util.Scanner;


public class Arr {
	public static void main(String s[])
	{
		int a[] = new int[3];
		int i;
		
		Scanner in=new Scanner(System.in);
		a[0]=in.nextInt();
		a[1]=in.nextInt();
		a[2]=in.nextInt();
		for(i=0;i<a.length;i++)
		{
			System.out.println("values"+a[i]);
		}
	}
	

}
