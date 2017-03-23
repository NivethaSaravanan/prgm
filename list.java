import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class list {
	public static void main(String s[])
	{
		ArrayList n= new ArrayList();
		n.add(8);
		n.add(4);
		n.add(7);
		n.add(6);
		n.add('c');
		System.out.println(n);
		Iterator i=n.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
}
}
 


