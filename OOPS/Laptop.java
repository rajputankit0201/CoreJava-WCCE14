class Laptop extends ElectronicDevice
{
	String brand;
	String input;
	
	Laptop(String name, String input, String brand, String input1)
	{
		super(name,input);
		this.brand = brand;
		this.input = input1;
	}

	public static void main(String[] args) 
	{
		//ElectronicDevice m = new Laptop("Electronic Device", "Electricity");
		Laptop l = new laptop("A/c", "Electricity");
		System.out.println(l.name);
		System.out.println(l.input);
		Laptop l = (Laptop);
		System.out.println(l.brand);
		System.out.println(l.input);
	}
}
