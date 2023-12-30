import java.util.*;
class StudentsMarks1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int [] marks = new int[5];

		for (int index = 0;index < marks.length ;index++ )
		{
			marks[index] = scan.nextInt();
		}
		for (int index = 0;index < marks.length ;index++ )
		{
			System.out.println("Marks of "+(index+1)+" index student: "+marks[index]);
		}
	}
}
