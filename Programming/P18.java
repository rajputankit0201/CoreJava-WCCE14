//Q.18} Write a java program with the help of conditional operator to check whether given number is even or odd.

class P18 
{
	public static void main(String[] args) 
	{
		int num = 16;
		
		switch (num % 2)
		{
		case 0:
			{
				System.out.println("Number is Even");
				break;
			}
		case 1: 
			{
				System.out.println("Number is Odd");
				break;
			}
	}
  }
}