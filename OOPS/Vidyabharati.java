//Q.Assignment no.4 :- Hybrid inheritance.

class Vidyabharati extends College
{
	String facultyName;
	String buildingName;

	Vidyabharati(String dept, String course, String facultyName, String buildingName)
	{
		super(dept, course);
		this.facultyName = facultyName;
		this.buildingName = buildingName;
		
	}
	public void knowledgeableArea()
	{
		System.out.println("Every students should take admmission in Vidyabharati college");
	}
	public static void main(String[] args) 
	{
	    Vidyabharati v = new Vidyabharati("Engineering", "BE in CS", "Ajit sir", "CS building");
		College c =(College)v;
		v.knowledgeableArea();
		c.admission();
		System.out.println(c.dept);
		System.out.println(c.course);
		System.out.println(v.facultyName);
		System.out.println(v.buildingName);
	}
}
