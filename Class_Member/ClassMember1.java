//Q.1} Create a global variable and try to initialise nextLine?

class ClassMember1
{
	static int i;
	           i=5; // error: <identifier> expected
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
