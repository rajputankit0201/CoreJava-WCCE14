// 20-08-2-23 String program6 replace character

class StringProgram6 
{
	public static void main(String[] args) 
	{
		String s = "Meri 1 tang nakli hai, Mai Hocky ka bahot bada player hu";
		int c = 0;
		String temp =" ";
		for (int i = 0;i < s.length() ;i++ )
		{
			if (s.charAt(i) == 'a')
			{
				c++;
			    if (c > 1)
			    {
					temp +='@';
			    }
				else
					temp += s.charAt(i);
			}
			else
				temp += s.charAt(i);
		}
		System.out.println(s);
		System.out.println(temp);
	}
}
