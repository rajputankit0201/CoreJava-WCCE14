class Eagle extends Bird
{
	String behaviour;
	String color;

	Eagle(String type, String voice, String color, String behaviour, String color1)
	{
		super(type,voice,color);
		this.behaviour = behaviour;
		this.color = color1;
	}
	public static void main(String[] args) 
	{
		Eagle e = new Eagle("Flying bird" , "chi-chi" , "Brown" , "Aggressive", "Whitish Brown");
		Bird b = e;

		System.out.println(b.type);
		System.out.println(b.voice);
		System.out.println(b.color);
		System.out.println(e.behaviour);
		System.out.println(e.color1);
	}
}
