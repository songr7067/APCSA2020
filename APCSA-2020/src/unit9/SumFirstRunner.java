package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Arrays;

public class SumFirstRunner
{
	public static void main( String args[] )
	{
//				[-99,1,2,3,4,5,6,7,8,9,10,5]
//				[10,9,8,7,6,5,4,3,2,1,-99]
//				[10,20,30,40,50,-11818,40,30,20,10]
//				[32767]
//				[255,255]
//				[9,10,-88,100,-555,2]
//				[10,10,10,11,456]
//				[-111,1,2,3,9,11,20,1]
//				[9,8,7,6,5,4,3,2,0,-2,6]
//				[12,15,18,21,23,1000]
//				[250,19,17,15,13,11,10,9,6,3,2,1,0]
//				[9,10,-8,10000,-5000,-3000]
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		System.out.println(ListSumFirst.go(arr1));
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListSumFirst.go(arr2));
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListSumFirst.go(arr3));
		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(32767));
		System.out.println(ListSumFirst.go(arr4));
		ArrayList<Integer> arr5 = new ArrayList<Integer>(Arrays.asList(255,255));
		System.out.println(ListSumFirst.go(arr5));
		ArrayList<Integer> arr6= new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));
		System.out.println(ListSumFirst.go(arr6));
		ArrayList<Integer> arr7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
		System.out.println(ListSumFirst.go(arr7));
		ArrayList<Integer> arr8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,1));
		System.out.println(ListSumFirst.go(arr8));
		ArrayList<Integer> arr9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
		System.out.println(ListSumFirst.go(arr9));
		ArrayList<Integer> arr10 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(ListSumFirst.go(arr10));
		ArrayList<Integer> arr11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
		System.out.println(ListSumFirst.go(arr11));
		ArrayList<Integer> arr12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
		System.out.println(ListSumFirst.go(arr12));
	}
}