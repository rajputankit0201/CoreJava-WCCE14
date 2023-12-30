// Q.5} take double type global variable and perform in char datatype in local variable?

class ClassMember5
{
	static double c = 98.5;
	public static void main(String[] args) 
	{
		System.out.println(c);
		char name = (char)c;
		System.out.println(name);
	}
}
