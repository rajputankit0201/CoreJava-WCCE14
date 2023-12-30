class Dog2 implements Animal2 , Mammal
{
	public void eat()
	{
		System.out.println("All Dogs can eat");
	}
	public void sound()
	{
		System.out.println("Bow-Bow");
	}
	public void thinking()
	{
		System.out.println("Dogs can think");
	}
	public void lifestyle()
	{
		System.out.println("Dogs lives in group");
	}
	public static void main(String [] args)
	{
		Animal2 d = new Dog2();
		d.eat();
		d.sound();
		Mammal m = (Mammal)d;
		m.thinking();
		m.lifestyle();
	}
}
