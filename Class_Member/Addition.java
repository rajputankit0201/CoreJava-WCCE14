import java.util.*;

class Addition
{
	public static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Pease enter the number");

		int num1=scan.nextInt();
		char ch = scan.next().charAt(0);
		int num2=scan.nextInt();

		int sum=add(num1, num2);
		System.out.println("Addition of "+num1+ " + " +num2+"= "+sum);
	}
}
