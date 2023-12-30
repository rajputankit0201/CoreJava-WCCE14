class Jeans implements Mufti
{
	public void wearing()
	{
		System.out.println("Human likes branded dress");
	}
	public void quality()
	{
		System.out.println("Branded dresses are best in quality ");
	}
	public static void main(String [] args)
	{
		Jeans j = new Jeans();
		j.wearing();
		j.quality();
	}
}