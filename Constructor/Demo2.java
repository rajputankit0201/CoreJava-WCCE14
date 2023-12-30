class Demo2
{
	Demo2()
	{
		System.out.println("Constructor of Demo class");
	}
	public static void main(String[] args) 
	{
		Demo2 d = new Demo2();
		System.out.println(d);
		Demo2 c = new Demo2();
		System.out.println(c);
	}
}
