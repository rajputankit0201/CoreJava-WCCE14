class Dog1 extends Animal1
{
	String colorOfEyes;

	Dog1(String color,float weight,String breed,String colorOfEyes)
	{
		super(color,weight,breed);
		this.colorOfEyes = colorOfEyes;
	}
	public void barking()
		{
			System.out.println("Bhow-Bhow");
		}
	public static void main(String[] args) 
	{
		Dog1 d = new Dog1("Black",45,"","");
		System.out.println(d.color);
	}

}