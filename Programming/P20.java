//Q.20} Write a java program to check whether given number is greater than 500 or not (with the help of Scanner class).

import java.util.*;

class P20 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Kindly enter the number: ");
		int num = scan.nextInt();

		String res = (num == 500)? "Number is equal to 500" : ((num > 500)? "Number is greater than 500" : "Number is less than 500");
		System.out.println(res);
	}
}
