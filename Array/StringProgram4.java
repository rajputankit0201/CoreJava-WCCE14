// 20-08-2-23 String program4

class StringProgram4
{
	public static void main(String[] args) 
	{
		String s ="Ketan kate bus stopch maghe rahtat";
		int vCount = 0;
		int cCount = 0;
		System.out.println(s);
		for (int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' )
			{
			   if (ch >='A' && ch >= 'a' && ch <= 'z')
			       ch= (char) (ch+32);//Conversion of uppercase to lower case(by add ascci value different)
			       
				   if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					   vCount++;
				   else
					   cCount++;			
		}
	}
	   System.out.println("character count : "+cCount);
	   System.out.println("character count : "+vCount);
}
}
