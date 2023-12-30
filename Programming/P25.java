class P25 
{
	public static void main(String[] args) 
	{
		int i =1;
		while (i <= 5){
			int j = 1;
			int x = 5;
			if (i % 2 == 0)
				x=4;

			while (j <= 5){
				System.out.print(x--);
				j++;
			}
			System.out.println();
			i++;
	}
 }
}