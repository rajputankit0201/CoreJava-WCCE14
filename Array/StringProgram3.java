// 20-08-2-23 String program3

class StringProgram3
{
	public static void main(String[] args) 
	{
		String s ="Ketan kate bus stopch maghe rahtat";
		int vCount = 0;
		int cCount = 0;
		for (int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if ( ch >= 'A' &&  ch <= 'Z' || ch >= 'a' && ch <= 'z' )
			{
			}
		}
		System.out.println(vCount);
		System.out.println(cCount);
	}
}
