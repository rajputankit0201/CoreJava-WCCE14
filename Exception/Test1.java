class Test1 
{
	public static void main(String[] args) 
	{
		String s = "Sabka Katega";
		System.out.println(s.charAt(-7));//StringIndexOutOfboundsException
		System.out.println(s.charAt(7));//Did not executed
		System.out.println(s.charAt(9));//Did not executed

	}
}
