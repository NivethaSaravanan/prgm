import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class vect 
{
	public static void main(String s[])
	{
		LinkedList n= new LinkedList();
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