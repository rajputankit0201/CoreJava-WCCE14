class Car 
{
	String brand;
	double speed;
	public void start()
	{
		Engine e = new Engine();
		e.start();
		System.out.println("Car started");
	}
	public void stop()
	{
		Break b = new Break();
		b.stop();
		System.out.println("Car stopped");
	}
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.start();
		c.stop();
	}
}