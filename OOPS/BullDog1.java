class Bulldog1 extends Dog1
{
	String smellingSence;
	String power;
	Bulldog1(String color,float weight,String breed,String colorOfEyes,String smellingSence ,String power)
	{
		super(color,weight,breed,colorOfEyes);
		this.smellingSence = smellingSence;
		this.power = power;
	}
	public void aggression()
	{
		System.out.println("Bulldogs are more aggression than others breeds of dog");
	}
	public static void main(String[] args) 
	{
		Bulldog1 b= new Bulldog1("Brown",40,"Bull dog","Black","Strong","305 PSI");

		System.out.println(b.color);
		System.out.println(b.weight);
		System.out.println(b.breed);
		System.out.println(b.colorOfEyes);
		System.out.println(b.smellingSense);
		System.out.println(b.power);

	}
}
