class Company 
{
	int eId;
	String name;
	private double salary;

	Company(int eId, String name, double salary)
	{
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}	
	public double getSalary()
	{
		return this.salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
}
