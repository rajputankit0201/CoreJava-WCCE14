//Q.5} Write a java program to print sum of 1st 25 even numbers.

class WhileLoop5 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int sum = 0;
		while (a <= 50)
		{
		  if (a % 2 == 0)
		      sum = sum+a;
		       a++;
		}
		System.out.println("Sum of even number:" +sum);
	}
}
