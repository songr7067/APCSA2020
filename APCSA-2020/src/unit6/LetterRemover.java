package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("",'0');
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int location = cleaned.indexOf(lookFor);
		while (location>0) {
			if (location != 0) {
				sentence = sentence.substring(0,location)+sentence.substring(location+1);
			}
			else {
				sentence = sentence.substring(1);
			}
			location = sentence.indexOf(lookFor);
		}
		cleaned = sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n\n";
	}
}