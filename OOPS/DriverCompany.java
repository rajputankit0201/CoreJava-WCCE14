class DriverCompany 
{

	public static void main(String[] args) 
	{
		Company emp1 = new Company(101,"Abhineet",15000);
		Company emp2 = new Company(102, "Himani", 25000);
		System.out.println(emp1.name);
		System.out.println(emp1.getSalary());
		System.out.println(emp2.name);
		System.out.println(emp2.getSalary());
	}
}
