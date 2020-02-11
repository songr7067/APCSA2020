package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public String go( String a )
	{
	   String first = a.substring(0,1);
	   String last = a.substring(a.length()-1);
	   if (first.equalsIgnoreCase("a") || first.equalsIgnoreCase("e") 
			   || first.equalsIgnoreCase("i") || first.equalsIgnoreCase("o") 
			   || first.equalsIgnoreCase("u") )
		   return "yes";
	   else if (last.equalsIgnoreCase("a") || last.equalsIgnoreCase("e") 
			   || last.equalsIgnoreCase("i") || last.equalsIgnoreCase("o") 
			   || last.equalsIgnoreCase("u"))
		   return "yes";
	   else 
		return "no";
	}
}