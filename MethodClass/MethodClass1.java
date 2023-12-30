class MethodClass1
{
	public static void friend(int given)
	{
		int need = 5000;
		int remain = given-need;
		System.out.println(remain);
	}
	public static void main(String[] args) 
	{
		friend (5000);
		System.out.println("Welcome back to home with empty hands");
	}
}