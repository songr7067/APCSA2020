package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		int length = word.length();
		for (int i = length; i>0; i--) {
			word = word.substring(0,i);
			System.out.println(word);
		}
		System.out.println("\n");
	}
}