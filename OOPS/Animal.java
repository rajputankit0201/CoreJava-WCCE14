class Animal 
{
	String color;
	float weight;
	String breed;

	public void sound()
	{
		System.out.println("Every animal has a sound");
	}

	Animal(String color,String weight,String breed)
	{
		this.color=color;
		this.weight=weight;
		this.breed=breed;
	}
	
}