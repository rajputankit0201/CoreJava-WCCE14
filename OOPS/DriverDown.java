class DriverDown extends Downcast
{
	String name;
	DriverDown(String name,String name1)
	{
		super(name);
	}
	public static void main(String[] args) 
	{
		DriverDown d = new DriverDown("Ankit","rajput");
		Downcast c = d;				//upcasting
		Downcast x = (Downcast)d;   //Downcasting
		System.out.println(c.name);
		System.out.println(d.name);
		c.method();
	}
}
