class ContactDetails2 
{
	String name;
	long mobileNo;

	ContactDetails2(String n, long m)
	{
		name = n;
		mobileNo = m;
	}

	public static void main(String[] args) 
	{
		ContactDetails2 r = new ContactDetails2("Raju" , 9876543210l);
		System.out.println(r.name);
		System.out.println(r.mobileNo);

		ContactDetails2 p = new ContactDetails2("Prasanna" , 9987654320l);
		System.out.println(p.name);
		System.out.println(p.mobileNo);
	}
}
