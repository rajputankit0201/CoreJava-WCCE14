import java.util.*;

class Watch 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Fasttrack");
		a.add("Titan");
		a.add("Sonata");
		a.add("Rollex");
		a.add("Noise");

		Iterator i = a.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		while (i.hasPrevious())
		{
			System.out.println(i.previous)
		}
	}
}

