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

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//add test cases	
		System.out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		Distance calculator = new Distance(x1,y1,x2,y2);
		
		calculator.calcDistance();
		calculator.print();
		System.out.println();
		
		System.out.println("----------TEST CASES----------");
		//test case for 1,1,2,1
		calculator.setCoordinates(1, 1, 2, 1);
		calculator.calcDistance();
		calculator.print();
		
		//test case for 1,1,-2,2
		calculator.setCoordinates(1, 1, -2, 2);
		calculator.calcDistance();
		calculator.print();
		
		//test case for 1,1,0,0
		calculator.setCoordinates(1, 1, 0, 0);
		calculator.calcDistance();
		calculator.print();
	}
}