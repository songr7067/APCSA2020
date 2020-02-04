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

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		//add test cases 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the coefficients of a quadratic in the form ax^2 + bx + c");
		System.out.print("Enter a :: ");
		int a = keyboard.nextInt();
		System.out.print("Enter b :: ");
		int b = keyboard.nextInt();
		System.out.print("Enter c :: ");
		int c = keyboard.nextInt();
		Quadratic equation = new Quadratic(a,b,c);
		equation.calcRoots();
		equation.print();
		
		equation.setEquation(5, -8,3);
		equation.calcRoots();
		equation.print();
		
		equation.setEquation(3, 2,-7);
		equation.calcRoots();
		equation.print();
		
		equation.setEquation(9, 6, 1);
		equation.calcRoots();
		equation.print();
		System.out.println(equation);
		
	}
}