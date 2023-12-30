class Apple extends Fruit
{
	String type;
	double price;

	Apple(String color,String taste,String type,double price)
	{
		super(color,taste);
		this.type= type;
		this.price= price;

	}
	public void use()
	{
		System.out.println("Make a juice/Eat because it is healthy fruit");
	}
	public static void main(String[] args) 
	{
		Apple a = new Apple("Red","sweet","kashmiri",699.99);
	}
}
