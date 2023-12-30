//Q.14} Write a java program to print highest of 3 numbers.

class P14 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int res= (num1 > num2 && num1 > num3)? num1 :((num2 > num3)? num2 : num3);
		int num4 = (num1 > num2)?((num1 > num3)? num1 : num3): (num2 > num3)? num2 : num3;
		System.out.println(res);
		System.out.println(num4);

	}
}
