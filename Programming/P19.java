//Q.19} Write a java program to check whether given number is two digit or not.

class P19 
{
	public static void main(String[] args) 
	{
		int a = 6;
		String res = (a >= 10 && a <= 99)? "Number is two digits" : "Number is not two digit";
		System.out.println(res);
	}
}
