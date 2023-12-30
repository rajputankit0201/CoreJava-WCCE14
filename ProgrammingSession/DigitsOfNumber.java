// Q.1} WAJP to print the digit present in given number.

class  DigitsOfNumber
{
	public static void main(String[] args) 
	{
		int num = 245;
		while (num > 0)
		{
			int r = num % 10;
			System.out.println(r);
			num = num/10;
		}
	}
}
