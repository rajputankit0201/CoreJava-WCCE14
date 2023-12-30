//Q} WAJP to perform Xylem and phloem number.

class Xylem 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int num1=num;
		int count=0;
		int sum=0;
		int sum1=0;

		while (num > 1)
		{
			count++;
			num/=10;
		}

	for (int i=1;i<=count;i++ )
	{
		int rem = num1 % 10;
		if (i == 1 || i==count)
		{
			sum = sum+rem;
		}
		else
		{
			sum1=sum1+rem;
		}
	}
	if (sum == sum1)
	{
		System.out.println("It is xylem number");
	}
	else
		{
			System.out.println("I is phloem number");
		}
	
	}
}
