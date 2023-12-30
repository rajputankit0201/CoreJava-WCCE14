//Q.12} WAJP to that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class main
{
	public static void main(String[] args) 
	{
		double num = 0;
		double x = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number(n) you want to calculate the avarege: ");
		int n = sc.nextInt();
		while (x <= n)
		{
			System.out.println("Input number " + "("+(int) x +")" + ":");
			num += sc.nextInt();
			x += 1;
		}
		double avgn = (num / n);

		System.out.println("Average: " avgn);
	}
}
