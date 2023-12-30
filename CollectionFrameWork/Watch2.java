import java.util.*;

class Watch2
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Fasttrack");
		a.add("Titan");
		a.add("Sonata");
		a.add("Rollex");
		a.add("Noise");

		Object o []= a.toArray();
		System.out.println(o);
		for (int i= 0;i< o.length ;i++ )
		{
			System.out.println(o[i]);
		}
	}
}

