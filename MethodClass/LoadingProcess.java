class LoadingProcess 
{
	static int v;
	static char ch;

	static
	{
		System.out.println("static block start");
		v = 150;
		ch = 'a';
		demo();
		System.out.println("static block end");
	}
	public static void demo()
	{
		System.out.println("Demo() of LoadingProcess class");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method start");
		System.out.println(v);
		System.out.println(ch);
		demo();
		System.out.println("Main Method end");
	}
}
