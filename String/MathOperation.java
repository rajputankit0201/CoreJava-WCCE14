class MathOperation 
{
	public static void main(String[] args) 
	{
		int num = 10;
		int div = 0;
		
		int quo;

		try
		{
			quo = num / div;
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(num);
		System.out.println(div);
	}
	
	
}
