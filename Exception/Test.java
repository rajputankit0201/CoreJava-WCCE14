class Test 
{
	public static void main(String[] args) 
	{
		String s = "Sabka Katega";
		try
		{
			System.out.println(a.charAt(-7));
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println(s.charAt(-8));//StringIndexOutOfboundsException
		System.out.println(s.charAt(8));//Did not executed
		System.out.println(s.charAt(10));//Did not executed
	}
}
