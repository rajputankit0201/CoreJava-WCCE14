class P2 
{
	public static void main(String[] args) 
	{
		int num =5;
		int num1 = num;
        int fact=1;
	

		for(   ;num > 0 ; num-- )
		{
		  fact = fact * num;
		}

		System.out.println(fact + " is the factorial of "+num1);
	}
}