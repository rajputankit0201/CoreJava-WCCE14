//Q.Assignment no.2 :- Multi level inheritance.

class Pune extends District
{
	String name;
	int population;
	Pune(String temple, String historicalPlace, String name, int population)
	{
		super(temple, historicalPlace);
		this.name= name;
		this.population = population;
	}
	public void voting()
	{
		System.out.println("Everyone should voting for nation");
	}
	public static void main(String[] args) 
	{
		Pune p = new Pune("Swami Moryagosavi" , "Shanivar wada" ,"Pimpri-Chinchwad", 2381000);
		District d = (District)p;
		p.voting();
		System.out.println(d.temple);
		System.out.println(d.historicalPlace);
		System.out.println(p.name);
		System.out.println(p.population);
	}
}
