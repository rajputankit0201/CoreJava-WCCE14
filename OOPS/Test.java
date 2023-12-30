class Test 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.a=160; // CTE: Cannot modify from another class
		System.out.println(obj.a);// CTE: Cannot access from another class
	}
}
