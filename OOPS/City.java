//Q.Assignment no.2 :- Multi level inheritance.

class City extends District 
{
	String name;
	String mall;
	City(String temple, String historicalPlace, String name, String mall)
	{
		super(temple, historicalPlace);
		this.name = name;
		this.mall = mall;
	}
	public void location()
	{
		System.out.println("Gov. provides lots of facilites in the city");
	}
	public static void main(String[] args)
	{
		City c = new City("Swami Moryagosavi" , "Shanivar wada" , "PCMC" , "Elpro");
		District d = (District)c;
		c.location();
		System.out.println(d.temple);
		System.out.println(d.historicalPlace);
		System.out.println(c.name);
		System.out.println(c.mall);
	}
}
