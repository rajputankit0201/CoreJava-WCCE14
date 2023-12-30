//WAJP to check whether the given number is odd or even
import java.util.Scanner;
class OddEven 
{
	public static void main(String[] args) 
	{
		int x;

		System.out.println("Enter an integer to check if it is Odd or Even ");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		if (x % 2 ==0)
		{
			System.out.println("You entered an Odd numbers.");
		}
		else
			System.out.println("You entered an Even numbers.");
	}
}
