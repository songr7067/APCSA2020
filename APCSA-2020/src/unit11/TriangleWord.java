package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int length = word.length();
		for(int i = 1; i<length+1;i++) {
			for (int k = i; k>0;k--) {
				System.out.print(word.substring(0,i));
			}
			System.out.println();
		}
		System.out.println();
	}
}