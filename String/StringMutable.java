class StringMutable
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Hum nahi");

		System.out.println(str.append("  Sudharenge"));
		System.out.println(str);

		System.out.println(str.replace(4,8, "Kabhi nahi"));
		System.out.println(str);

		System.out.println(str.delete(4,10))
	}
}
