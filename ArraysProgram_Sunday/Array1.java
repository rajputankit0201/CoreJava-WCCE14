//Q.1} Arrays program  reverse order(add two array)

class  Array1
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8};

		int size =arr.length -1;
		int temp = 0;
		for (int i = 0;i <= size;i++ )
		{
			temp = arr[size];
			arr[size]=arr[i];
			arr[i] = temp;
			size--;
		}
		for (int i=0;i<arr.length ;i++ )
		{
		System.out.println(arr[i]);
     	}
  }  
}
