//Q.3} WAJP to print number which contains atleast one 0 upto 100.

class  NumbersWith0
{
	public static void main(String[] args) 
	{
		int start = 10;
		int end = 100;

		while (start <= end)
		{
			int copy = start;
			int count = 0;
			while (copy > 0)
			{
				int r = copy % 10;
				if (r ==0)
				{
					count++;
				}
				copy /=10;
			}
			if (count >= 1)
			{
			
				System.out.println(start);
			}
			start++;
		}
	}
}
