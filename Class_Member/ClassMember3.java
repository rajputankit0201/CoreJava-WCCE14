// Q.3} Declare a double type global variable and try to perform narrowing with int type local variable? 

class  ClassMember3
{
	static double d=995.88;
	public static void main(String[] args) 
	{
		double d=995.88;
		int x = (int) d;
		System.out.println(x);
	}
}
