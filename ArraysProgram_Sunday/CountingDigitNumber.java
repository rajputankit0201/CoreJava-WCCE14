//Q.2}Counting the digits number and printing the count in reverse order.

class  CountingDigitNumber
{
	public static void main(String[] args) 
	{
		int num =325;
		int count =0;
		System.out.println("Digits of"+num+ " is:");

	    while (num > 0)
	    {
		count++;
		System.out.println(num %10);
		num = num/10;
	    }
	    System.out.println("Count of digit " +count);
    }
}