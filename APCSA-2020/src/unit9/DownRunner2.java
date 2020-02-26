package unit9;

import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner2
{
	public static void main( String args[] )
	{
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345));
		System.out.println(ListDown.go(arr1));
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListDown.go(arr2));
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListDown.go(arr3));
		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(32767));
		System.out.println(ListDown.go(arr4));
		ArrayList<Integer> arr5 = new ArrayList<Integer>(Arrays.asList(255,255));
		System.out.println(ListDown.go(arr5));
		ArrayList<Integer> arr6= new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
		System.out.println(ListDown.go(arr6));
		ArrayList<Integer> arr7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
		System.out.println(ListDown.go(arr7));
		ArrayList<Integer> arr8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
		System.out.println(ListDown.go(arr8));
		ArrayList<Integer> arr9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
		System.out.println(ListDown.go(arr9));
		ArrayList<Integer> arr10 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(ListDown.go(arr10));
		ArrayList<Integer> arr11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455));
		System.out.println(ListDown.go(arr11));
		ArrayList<Integer> arr12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
		System.out.println(ListDown.go(arr12));
	}
}