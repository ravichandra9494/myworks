
public class Dup
{
	
		 public static void main(String argu[]) {

		    String str = "ravirair";
		  int count = 0;
		  char[] ch = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++)
		  {
		   for (int j = i + 1; j < str.length(); j++)
		   {
		    if (ch[i] == ch[j]) {
		     System.out.println(ch[j]);
		     count++;
		     break;
		    }
		   }
		  }
		 }  
		}