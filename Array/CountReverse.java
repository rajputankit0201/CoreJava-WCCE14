// 20-08-2023 String program11 counts reverse the word without using inbiult method

class  CountReverse
{
	public static void main(String[] args) 
	{
		String s = "Sud Durge sud";
		String rev = "";
		String temp = "";

		for (int i = s.length()-1;i >= 0;i-- )
		{ 
			rev += s.charAt(i);	
		}
		for (int i = 0;i < s.length() ;i++ )
		{
			temp = s.charAt(i) + temp;
		}
		System.out.println(s);
		System.out.println(rev);
		System.out.println(temp);
	}
}
