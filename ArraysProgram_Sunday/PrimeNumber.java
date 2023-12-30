//Q.5} Prime Number factors

class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num = 15;
		int factors = 0;

		for (int i = 1;i <= num;i++)
		{
			if (num % i ==0)
			{
				factors++;
		    }
		}
			if (factors == 2)
			{
				System.out.println("Prime Number");
			}
			else
				System.out.println("Not Prime Number");
		}
}		