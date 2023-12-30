class NullPointer 
{
	int a = 100;
	public static void main(String[] args) 
	{
		//1st statement
		String s = null;
		System.out.println(s.length());
		//2nd statement
		NullPointer n = null;
		System.out.println(n.a);
		//3rd statement
		NullPointer [] arr = {  (new NullPointer()),null};
		System.out.println(arr[0].a);
		System.out.println(arr[1].a);
	}
}
