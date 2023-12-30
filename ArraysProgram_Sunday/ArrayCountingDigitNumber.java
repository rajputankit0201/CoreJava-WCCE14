//Q.3} With the help of array Counting the digits number and printing the count in reverse order.

class  ArrayCountingDigitNumber
{
	public static void main(String[] args) 
	{
		int [] arr = {123,456,789, 456, 234};
			
		for (int i = 0;i < arr.length ;i++)
		{
		
		int num =arr[i];
		int count =0;

		while (num > 0)
	    {
		count++;
		System.out.println(num % 10);
		num = num/10;
	    }
	    System.out.println("Count of digit " +arr[i]+": "+count);
    }
 }
}