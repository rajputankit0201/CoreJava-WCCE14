class ParkerPen extends Pen
{
	String type;
	String color;

	ParkerPen(String name,double price,String type,String color)
	{
		super(name,price);
		this.name= name;
		this.price= price;
	}
	public void use()
	{
		System.out.println("Anything to write on notebook we need Pen");
	}
	public static void main(String[] args) 
	{
		ParkerPen p = new ParkerPen("Parker",570.22,"Gel Pen","Blue");
	}
}
