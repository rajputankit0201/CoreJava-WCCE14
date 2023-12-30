
import java.util.*;

class Cm5
{
   public static int add(int a,int b)
	{ 
	   int sum = a+b;
	   return sum;
    }
	 public static int subs(int a,int b)
		 int sub = a-b;
	 	 return sub;
	 public static void main(String[] args)
	     {
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter the Number");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int sum = add(num1,num2);
             System.out.println("Addition of "+ num1 + " & "+num2+": "+sum);
	     }
}
 