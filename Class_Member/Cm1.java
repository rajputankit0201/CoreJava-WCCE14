class Cm1 
{
	static int num;
	static
    {
	   num = 420;
	   System.out.println(num);
	   System.out.println("Static block Execution");
	}


     	public static void main(String[] args) 
	{
         System.out.println("Main start");
		 System.out.println(num);
		 System.out.println("Main End");
	}
}