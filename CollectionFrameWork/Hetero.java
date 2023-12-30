import java.util.*;

class Hetero 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Sakshi");
		a.add("JayPrakash");
		a.add("Ketan");
		a.add("Ankit");
		a.add("Himani");
		a.add("Ashish");
		a.add("Prasanna");
		
		ArrayList m = new ArrayList();
		m.add("Sujit");
		m.add("Sakshi");
		m.add("Nagesh");
		m.add("Ketan");
		m.add("Ankit");
		
		ArrayList b = new ArrayList();
		b.add("Supriya");
		b.add("Himani");
		b.add("Ashish");
		b.add("Prasanna");

		System.out.println("a "+a);
		System.out.println("m "+m);
		System.out.println("b "+b);
		System.out.println(m.removeAll(a));
		System.out.println(a.retainAll(b));
		System.out.println("m.removeAll(a)");
		System.out.println("m "+m);
		System.out.println("b "+b);
		System.out.println("a.retainAll(b)");
		System.out.println("a "+a);
	}
}
