//  Q.6} Write a java program print Product of numbers in range of 20 to 40.

class WhileLoop6 
{
	public static void main(String[] args) 
	{   
	  int x = 1;
	  double a = 1;
	  while (x <= 40)
	  {
	      if (x >= 20 && x <= 40)
	      {
			a = a * x;
	      }
		  x++;
	  }
		System.out.println("Product of the  numbers in range 20 to 40 is: "+a);
	
 }
}