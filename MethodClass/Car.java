class Car 
{
	static String brand;
	static double price;
	static String color;

	static
	{
		System.out.println("Static Block-1 start");
		brand = "Tata";
		BHP = 89;
		System.out.println("Static Block-1 end");
	}
	public static void travel()
	{
		System.out.println("Trip to Goa");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method start");
		System.out.println("Specification of car :");
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(BHP);
		System.out.println("Main Method end");
	}
	static
	{
		System.out.println("Static Block-2 start");
		price = 750000;
		color = "Black";
		travel();
	    System.out.println("Static Block-2 end");
	}
	static int BHP;
}
