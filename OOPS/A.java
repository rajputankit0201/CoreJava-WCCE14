class A 
{
	private int a =150;
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.a=500;// Can modify  in same class
		System.out.println(obj.a);// Can access in same class
	}
}
