class P1 
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = ++a - --a +a + a++ - --a;
		System.out.println(a);
		System.out.println(b);
	}
}
