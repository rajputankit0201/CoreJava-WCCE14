//Q.7} Write a java program print factorial of 5.

class WhileLoop7 
{
	public static void main(String[] args) 
	{
		int a = 1, num = 5;
		int fact = 1;
		while (a >= 5)
		   {
		
               fact *= a;  
			   a++;
	       }
		       System.out.println("fact of 5: " +fact);
			   
     }
}