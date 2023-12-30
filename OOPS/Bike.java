// Assignment No.1:- Single level inheritance

class Bike extends Vehicle
{
	String model;
	double price;

	Bike(String type, String name, String model, double price)
	{
		super(type,name);
		this.model= model;
		this.price= price;
	}

	public void purpose()
	{
		System.out.println("Bike is comfortable for two people");
	}
	public static void main(String[] args) 
	{
		Bike b = new Bike("Electric", "two wheeler", "chetak", 180000);
		Vehicle v= (Vehicle)b;
		b.purpose();
		v.use();
		System.out.println(b.type);
		System.out.println(b.name);
		System.out.println(b.model);
		System.out.println(b.price);

	}
}
