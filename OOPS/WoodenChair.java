//Q.Assignment no.3 :- Hierarchical inheritance.

class WoodenChair extends Wood 
{
	String name;
	String  color;

	WoodenChair(double width,double length,String name, String color)
	{
		super(width, length);
		this.name= name;
		this.color = color;
	}
	public void officeWork()
	{
		System.out.println("Chairs are mandatory in office");
	}
	public static void main(String[] args) 
	{
		WoodenChair c = new WoodenChair(80, 100,"Boss chair", "Black");
		c.officeWork();
		W.furniture();
		System.out.println(c.width);
		System.out.println(c.length);
		System.out.println(c.name);
		System.out.println(c.color);
	}
}
