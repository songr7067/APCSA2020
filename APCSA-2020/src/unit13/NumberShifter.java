package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] arr1 = new int[size];
		for(int i = 0; i < size;i++) {
			arr1[i] = (int) (Math.random()*10+1);
		}
		return arr1;
	}
	
	public static void shiftEm(int[] array)
	{
	  for( int i = 0; i < array.length; i++){
				
	    int j = i;
				
	    while( j < array.length && array[j] != 7){

	       j++;
	    }
	 
	    if( j != i && j < array.length ){
	       int t = array[j];
	       array[j] = array[i];
	       array[i] = t;
	    }
	  }
	}
}