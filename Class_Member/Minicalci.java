import java.util.*;

class Minicalci 
{   
    public static int add(int a, int b)
	{
		int res = a+b;
		return res;
	}
	public static int sub(int a, int b)
	{
		int res = a-b;
		return res;
	}
	public static int mul(int a, int b)
	{
		int res = a*b;
		return res;
	}
	public static int div(int a, int b)
	{
		int res = a/b;
		return res;
	}
	public static int mod(int a, int b)
	{
		int res = a%b;
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");

		int num1=scan.nextInt();
		char operator=scan.next().charAt(0);
		int num2=scan.nextInt();
		int result=0;
		switch (operator)
		{
				case '+' :{
					result=add(num1, num2);
					System.out.println(result);
					break;
			}
			
				case '-' :{
					result=sub(num1, num2);
					System.out.println(result);
					break;
			}
				case '*' :{
					result=mul(num1, num2);
					System.out.println(result);
					break;
			}
				case '/' :{
					result=div(num1, num2);
					System.out.println(result);
					break;
			}
				case '%' :{
					result=mod(num1, num2);
					System.out.println(result);
					break;
			}
		default :{
			System.out.println(result);
		
		}
	}
 }
}