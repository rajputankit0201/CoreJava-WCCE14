class MethodClass 
{
	public static int friend(int given)
	{
		int need = 2000;
		int remain = given - need;
		return remain;
	}
	public static void main(String[] args) 
	{
		int container = friend (5000);
		System.out.println(container);
	}
}
