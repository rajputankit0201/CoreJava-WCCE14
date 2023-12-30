//Q.Assignment no.2 :- Multi level inheritance.

class District
{
	String temple;
	String historicalPlace;

	public void location()
	{
		System.out.println("My District is famous for temple and historical places");
	}

	District(String temple, String historicalPlace)
	{
		this.temple = temple;
		this.historicalPlace = historicalPlace;
	}
}
