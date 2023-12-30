//encapsulation getter and setter method

class Driverc 
{
	public static void main(String[] args) 
	{
		Private p = new Private(100);
	
		System.out.println("The value of the declared private Eid: "+p.getEid());
		p.setEid(200);
		System.out.println("the modified value of the private variable Eid is: "+p.getEid());
	}
}
