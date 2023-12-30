// Q.21} Write a java program to create a class to check whether given mobile brand is available or not in the stock of mobile shop (with the help of else if ladder).
import java.util.*;

class P21 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter the mobile brand name to check in shop : ");
		String brand = scan.nextLine();

		if (brand.equals("vivo"))
		{
			System.out.println(brand +" is available in stock. ");
		}
		else if (brand.equals("oppo"))
		{
			System.out.println(brand +" is available in stock. ");
		}
		else if (brand.equals("oneplus"))
		{
			System.out.println(brand +" is available in stock. ");
		}
		else if (brand.equals("apple"))
		{
			System.out.println(brand +" is available in stock. ");
		}
		else if (brand.equals("nokia"))
		{
			System.out.println(brand +" is available in stock. ");
		}
		else if (brand.equals("redmi"))
		{
			System.out.println(brand +" is available in stock. ");
		}
		else
		{
			System.out.println("Sorry, " + brand + " is out of stock. ");
		}
	}
}
