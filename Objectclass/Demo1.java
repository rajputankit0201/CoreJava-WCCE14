class Demo1 
{
	int a;

	Demo1(int a)
	{
		this.a = a;
	}

	public boolean equals(Object o)
	{
		Demo1 d = (Demo1)o;
		return this.a == d.a;
	}
	public static void main(String[] args) 
	{
		Demo1 d = new Demo1(200);
		Demo1 x = new Demo1(200);
		System.out.println(d);
		System.out.println(x);
		System.out.println(d == x);
		System.out.println(d.a == x.a);
		System.out.println(d.equals(x));
	}
}
