////Q.16} WAJP to print swap two variables? 

class Exercise15A 
{
	public static void main(String[] args) 
	{
		//int, double, float
		int a, b;
		a = 15;
		b = 27;
		System.out.println("Before swapping : a, b = "+a+", "+ + b);//Before swapping : a, b = 15, 27
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping : a, b = "+a+", "+ + b);//After swapping : a, b = 27, 15
	}
}
