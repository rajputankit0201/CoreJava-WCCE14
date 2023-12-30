class Dog extends Animal 
{
	String colorOfEye;
	Dog(String color,String weight,String breed,String colorOfEye)
	{
		super(color,weight,breed);
		this.colorOfEye=colorOfEye;
	}
	public void barking()
	{
		System.out.println("bhow bhow");
	}
}
