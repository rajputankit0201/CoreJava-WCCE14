import java.io. *;

class FileCreation
  
{
	public static void main(String[] args) 
	{
		String path = "C:\Users\Om Sai Ram\WCCE14\\File\\note.txt";
		FileOutputStream f = new FileOutputStream(path);
		System.out.println("File is created");
	}
}
