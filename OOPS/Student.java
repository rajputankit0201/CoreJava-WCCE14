//Q.Assignment no.4 :- Hybrid inheritance.

class Vidyabharati
{
	String facultyName;
	String buildingName;

	Vidyabharati(String dept, String course, String facultyName, String buildingName)
	{
		super(dept, course);
		this.String facultyName = facultyName;
		this.String buildingName = buildingName;
		
	}
	public void knowlagableArea()
	{
		System.out.println("Every students should take admmission in Vidyabharati college");
	}
	public static void main(String[] args) 
	{
	Vidyabharati v = new Vidyabharati("Engineering", "BE in CS", "Ajit sir", "CS building");
		College c =(College)s;
		c.admission();
		v.knowlagableArea();
		System.out.println(c.dept);
		System.out.println(c.course);
		System.out.println(v.facultyName);
		System.out.println(v.buildingName);
	}
}
