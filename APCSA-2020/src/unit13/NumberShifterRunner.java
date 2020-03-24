package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) 
	{
		//add test cases
		int randomLength = (int) (Math.random()*5+10);
		int[] arr1 = new int[randomLength];
		for(int i = 0; i < randomLength;i++) {
			arr1[i]= (int) (Math.random()*10+1);
		}
		System.out.println(arr1);
	}
}



