class ForLoop4 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 1;i <= 5 ;i++ ){
			for (int j = 1;j<=n ;j++ ){
		         System.out.print("*");
     	   }
            if(i==2){
				n=2;
			}
			System.out.println();
       }
	}
}