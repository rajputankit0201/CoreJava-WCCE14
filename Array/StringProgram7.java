// 20-08-2-23 String program7 replace character
import java.util.*;
class StringProgram7 
{
	public static void main(String[] args) 
	{
		String s = "Meri 1 tang nakli hai, Mai Hocky ka bahot bada player hu";
		int c = 0;
		String[] temp = s.split(" ");

		HashSet hs = new HashSet();
		for (String s1s:temp )
		{
			hs.add(s1);
		}
		System.out.println(s);
		System.out.println(hs);
	}
}
