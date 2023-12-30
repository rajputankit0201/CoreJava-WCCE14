class WhileLoop123 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int sum = 0;
		while (a <=25)
		{
	      if (a % 2 == 0){
			  sum=sum+a;
		  }
		      a++;

		}
		System.out.println("Sum of even number: " +sum);
	}
}
