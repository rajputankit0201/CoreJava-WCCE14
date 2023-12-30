import java.io. *;

class FileCreation
  
{
	public static void main(String[] args) 
	{
		String path = "D:\\File\\note.txt";
		FileOutputStream f = new FileOutputStream(path);
		System.out.println("File is created");
	}
}
