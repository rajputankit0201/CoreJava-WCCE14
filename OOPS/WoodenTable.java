//Q.Assignment no.3 :- Hierarchical inheritance.

class WoodenTable extends Wood
{
	String table;
	double price;

	WoodenTable(double width, double length , String table1, double price1)
	{
		super(width,length);
		this.table = table;
		this.price = price;
	}
	public void seating()
	{
		System.out.println("Chair gives comfort");
	}
	public static void main(String[] args) 
	{
		WoodenTable t = new WoodenTable(80, 100 ,"DeskTable", 15000);
		Wood w = (Wood)t;
		t.seating();
		W.furniture();
		System.out.println(W.width);
		System.out.println(W.length);
		System.out.println(t.table);
		System.out.println(t.price);
	}
}
