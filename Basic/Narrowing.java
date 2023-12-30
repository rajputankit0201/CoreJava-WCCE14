class Narrowing 
{
	public static void main(String[] args) 
	{
		//int --> char
		int n = 100;
		char m= (char)n;
		System.out.println(n);//100
		System.out.println(m);//d

	   //double --> int
	   double d = 154.554;
	   int i= (int)d;
	   System.out.println(d);//154.154
	   System.out.println(i);//
	}
}
