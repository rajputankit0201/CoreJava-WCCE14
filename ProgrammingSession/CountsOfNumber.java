//Q.2} WAJP to counts the digits present inside the number.

class CountsOfNumber 
{
	public static void main(String[] args) 
	{
		int num = 245;
		int count = 0;
		while (num > 0)
		{
			count++;
			num = num/10;
		}
		System.out.println(count);
	}
}
