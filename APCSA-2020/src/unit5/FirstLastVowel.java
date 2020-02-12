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
	   String vowels = "aeiouAEIOU";
	   if(vowels.contains(first)||vowels.contains(last))
		   return "yes";
	   else 
		return "no";
	}
}