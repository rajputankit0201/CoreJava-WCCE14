import java.util.*;
class LoginPage
{
   public static void main(String[]args)
	{
	   String Username = "ABCD123";
	   String Password = "ABCD@1234";
	   Scanner scan = new Scanner(System.in);
	   boolean b = true;

	   while (b){
		   String tempUser = scan.nextLine();
		   String tempPass = scan.nextLine();
		   if (tempUser.equals(Username) && tempPass.equals(Password))
		      {
			   b= false;
			   System.out.println("Logged in sucessfully");
			  }
		      else{
			        System.out.println("Credential are not matching");
		      }
	   }
    }
}