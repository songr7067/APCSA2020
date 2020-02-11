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
		for (int i = 0; i< length-1; i++) {
			System.out.println(word);
			word = word.substring(0,word.length()-i);
		}
	}
}