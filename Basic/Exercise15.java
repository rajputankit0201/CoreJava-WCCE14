//Q.15} WAJP to print swap two variables?

class Exercise15 
{
	public static void main(String[] args) 
	{
		int a, b, temp;
		a=15;
		b=27;
		System.out.println("Before swapping : a, b = "+a+", "+ + b);//Before swapping : a, b = 15, 27

		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : a, b = "+a+", "+ + b);//After swapping : a, b = 27, 15
	}
}
