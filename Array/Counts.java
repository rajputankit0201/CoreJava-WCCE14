// 20-08-2023 String program10 counts the word without using inbiult method

class  Counts
{
	public static void main(String[] args) 
	{
		String s = "Maza atma tuzyat Tuza atma Om bhatt swaha";
		int count = 0;

		for (int i = 0;i < s.length();i++ )
		{
			if (i == 0 && s.charAt(i) != ' ')
			{
				count++;
			}
			else if (i < s.length()-1 && s.charAt(i) == ' ' && s.charAt(i+1) !=' ' )
			{
				count++;
			}
		}

		System.out.println(count);
	}
}
