package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   
	   //abe ape
	   WordsCompare dictionary = new WordsCompare("abe","ape");
	   dictionary.compare();
	   System.out.println(dictionary);
	   //giraffe gorilla
	   dictionary.setWords("giraffe", "gorilla");
	   dictionary.compare();
	   System.out.println(dictionary);
	   //one two
	   dictionary.setWords("one", "two");
	   dictionary.compare();
	   System.out.println(dictionary);
	   //fun funny
	   dictionary.setWords("fun", "funny");
	   dictionary.compare();
	   System.out.println(dictionary);
	   //123 19
	   dictionary.setWords("123", "19");
	   dictionary.compare();
	   System.out.println(dictionary);
	   //193 1910
	   dictionary.setWords("193", "1910");
	   dictionary.compare();
	   System.out.println(dictionary);
	   //goofy godfather
	   dictionary.setWords("goofy", "godfather");
	   dictionary.compare();
	   System.out.println(dictionary);
	   //funnel fun
	   dictionary.setWords("funnel", "fun");
	   dictionary.compare();
	   System.out.println(dictionary);
	}
}