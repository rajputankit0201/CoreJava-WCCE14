//Q.7} WAJP that takes a numbers as input and prints its multiplication table up to 10.
import java.util.*;
class Exercise7
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("Input a number: ");
		int num1 = a.nextInt();

		for (int i = 0;i<10 ;i++ )
		{
			System.out.println(num1 + " x " + "="+(num1 * (i+1)));
	    }
    }
}
