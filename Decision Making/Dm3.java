class Dm3 
{
	public static void main(String[] args) 
	{
        String card = "Active" ;
		if (card == "Active")
		{
			System.out.println("Choose the options");
			System.out.println("Withdraw");
			System.out.println("Check balance");
			String operation = "Withdraw" ;
            if (operation == "Withdraw")
			{
				System.out.println("Enter the pin");
				String pin = "valid" ;
				if (pin == "valid")
				{ 
					System.out.println("Your money sucessfully withdraw");
				}
				else {
					System.out.println("Entered wrong pin");
				}
			}
			else {
				System.out.println("Entered valid option");
			}
		}
		else{
			  System.out.println("Card is not active please visit nearest branch");
		}
	}
}