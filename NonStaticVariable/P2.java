class P2 
{
	{
		System.out.println("NSB1 of P2");
	}
	P2()
	{
		System.out.println("Constructor");
	}
		public static void main(String[] args) 
	{
		System.out.println("Main start");
		new P2();
		new P2();
		System.out.println("Main end");
	}
}