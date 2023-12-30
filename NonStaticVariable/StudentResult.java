class StudentResult 
{
	String name;
	float marks;

	StudentResult(String n,float m)
	{
		name = n;
		marks = m;
	}
	public static void main(String[] args) 
	{
		StudentResult k = new StudentResult("Kanchana", 35.67f);
		StudentResult t = new StudentResult("TatyaVinchu", 90.88f);
		StudentResult h = new StudentResult("Haster", 57.33f);
		StudentResult n = new StudentResult("Nisha", 45.67f);

		System.out.println(k.name);
		System.out.println(k.marks);
		System.out.println(t.name);
		System.out.println(t.marks);
		System.out.println(h.name);
		System.out.println(h.marks);
		System.out.println(n.name);
		System.out.println(n.marks);
	}
}
