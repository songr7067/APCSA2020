package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		//45 miles 0 hours 32 minutes
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		System.out.println("------------OTHER TEST CASES------------");
		//96 miles 1 hour 43 minutes
		test.setNums(96, 1, 43);
		test.calcMPH();
		test.print();
		
		//100 miles 2 hours 25 minutes
		test.setNums(100, 2, 25);
		test.calcMPH();
		test.print();
		
		//50 miles 2 hours 25 minutes
		test.setNums(50, 2, 25);
		test.calcMPH();
		test.print();
		
	}
}