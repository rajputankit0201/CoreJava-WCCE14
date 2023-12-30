class Tulsi extends Tree
{
	
	public void generateOxygen()
	{
		System.out.println("Tulsi trees are generating max. % of oxygen");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main start");
		Tree c = new Tree();
		c.generateOxygen();
		Tulsi t = new Tulsi();
		Tree t1 = t;
		t1.generateOxygen();
		t.generateOxygen();
		System.out.println("Main end");
	}
}