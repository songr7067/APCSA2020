package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality test = new StringEquality("hello", "goodbye");
		//hello goodbye
		test.checkEquality();	
		System.out.println(test);
		//one two
		test.setWords("one", "two");
		test.checkEquality();	
		System.out.println(test);
		//three four
		test.setWords("three", "four");
		test.checkEquality();	
		System.out.println(test);
		//TCEA UIL
		test.setWords("TCEA", "UIL");
		test.checkEquality();	
		System.out.println(test);
		//State Champions
		test.setWords("State", "Champions");
		test.checkEquality();	
		System.out.println(test);
		//ABC ABC
		test.setWords("ABC", "ABC");
		test.checkEquality();	
		System.out.println(test);
		//ABC CBA
		test.setWords("ABC", "CBA");
		test.checkEquality();	
		System.out.println(test);
		//Same Same
		test.setWords("Same", "Same");
		test.checkEquality();	
		System.out.println(test);
	}
}