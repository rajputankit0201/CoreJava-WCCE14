class A1 implements Demo 
{
	public void test()
	{
		System.out.println("test() of class A");
	}
	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.test();

		Demo d = a;
		d.test();
	}
}
