import java.util.*;
class MobileCollection 
{
	public static void main(String[] args) 
	{
		TreeSet <String> a = new TreeSet<>();
		a.add("Samsung s20");
		a.add("Nokia 3310");
		a.add("Nothing phone-1");
		a.add("Moto g72");

		System.out.println(a);

		HashSet<String> x = new HashSet<>();
		x.add("Pixel");
		x.add("Redmi");
		x.add("Oppo");
		x.add("Oneplus");
		System.out.println("Before addAll"+ a);
		System.out.println("Before addAll"+ x);
		a.addAll(x);
		System.out.println("After addAll"+ a);
		System.out.println("After addAll"+ a);
	}
}
