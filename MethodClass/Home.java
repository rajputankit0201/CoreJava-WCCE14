class Home 
{
	public static String son(String instruction)
	{
		System.out.println("went to shop and purchased" +instruction);

		String items = instruction;
		return items;
	}
	public static void main(String[] args) 
	{
		System.out.println("Mom stared preparing the food");
		System.out.println("Chilly powder and spices are finished in home");

		String container = son("Chilly powder and spices");

		System.out.println("Mom used "+container+" and made food");
	}
}
