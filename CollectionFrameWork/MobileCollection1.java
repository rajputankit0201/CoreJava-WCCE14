import java.util.*;
class MobileCollection1
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Samsung s20");
		a.add("Nokia 3310");
		a.add("Nothing phone-1");
		a.add("Moto g72");
		System.out.println(a);
	
		a.addAll(2,"GooglePixel");
		System.out.println(a);
	}
}
