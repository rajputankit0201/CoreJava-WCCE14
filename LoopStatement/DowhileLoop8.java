// Q.8} Write a java program to print odd numbers in the range of 20 to 50 using do while loop.


class DowhileLoop8 
{
	public static void main(String[] args) 
	{
		int x = 20;
		do
		  {
		  if (x % 2 != 0)
		  System.out.println(x);
          x++;
		  }
		      while (x <= 50);
	}
}
