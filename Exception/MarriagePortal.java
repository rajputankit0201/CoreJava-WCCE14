import java.util.*;
class MarriagePortal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age >= 21)
		{
			System.out.println("Get married soon");
		}
		else
		{
			try
			{
				throw new InvalidAgeException("Idiot grow up first");
			}
			catch (InvalidAgeException e)
			{
				e.printstackTrace();
			}
			System.out.printnl("Main End");
	}
}
