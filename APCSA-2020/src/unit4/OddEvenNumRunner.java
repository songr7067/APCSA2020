package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class OddEvenNumRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//add in input
		System.out.println("5 is odd :: " + OddEvenNum.isOdd(5));
		System.out.println("5 is even :: " + OddEvenNum.isEven(5) + "\n");
		
		//add in more test cases
		System.out.print("Enter a whole number  :: ");
		int num = keyboard.nextInt();
		System.out.println(num + " is odd :: " + OddEvenNum.isOdd(num));
		System.out.println(num + " is even :: " + OddEvenNum.isEven(num) + "\n");
		

		num = 111;
		System.out.println(num + " is odd :: " + OddEvenNum.isOdd(num));
		System.out.println(num + " is even :: " + OddEvenNum.isEven(num) + "\n");
		
		num = 2000;
		System.out.println(num + " is odd :: " + OddEvenNum.isOdd(num));
		System.out.println(num + " is even :: " + OddEvenNum.isEven(num) + "\n");
		
		num = -99;
		System.out.println(num + " is odd :: " + OddEvenNum.isOdd(num));
		System.out.println(num + " is even :: " + OddEvenNum.isEven(num) + "\n");
		
		num = 1111;
		System.out.println(num + " is odd :: " + OddEvenNum.isOdd(num));
		System.out.println(num + " is even :: " + OddEvenNum.isEven(num) + "\n");
		
		num = -850;
		System.out.println(num + " is odd :: " + OddEvenNum.isOdd(num));
		System.out.println(num + " is even :: " + OddEvenNum.isEven(num) + "\n");
	}
}