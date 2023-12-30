//Q.4} Atleast two digit even number
class  AtleastTwodigit
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