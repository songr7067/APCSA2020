package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Arrays;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
//				[7,1,5,3,11,5,6,7,8,9,10,12345,11]
//				[11,9,8,7,6,5,4,3,2,1,-99,7]
//				[10,20,30,40,5,41,31,20,11,7]
//				[32767,70,4,5,6,7]
//				[2,7,11,21,5,7]
//				[7,255,11,255,100,3,2]
//				[9,11,11,11,7,1000,3]
//				[7,7,7,11,2,7,7,11,11,2]
//				[2,4,6,8,8]
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(ListOddToEven.go(arr1));
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		System.out.println(ListOddToEven.go(arr2));
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
		System.out.println(ListOddToEven.go(arr3));
		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
		System.out.println(ListOddToEven.go(arr4));
		ArrayList<Integer> arr5 = new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
		System.out.println(ListOddToEven.go(arr5));
		ArrayList<Integer> arr6= new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
		System.out.println(ListOddToEven.go(arr6));
		ArrayList<Integer> arr7 = new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,1000,3));
		System.out.println(ListOddToEven.go(arr7));
		ArrayList<Integer> arr8 = new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
		System.out.println(ListOddToEven.go(arr8));
		ArrayList<Integer> arr9 = new ArrayList<Integer>(Arrays.asList(2,4,6,8,8));
		System.out.println(ListOddToEven.go(arr9));
	}
}