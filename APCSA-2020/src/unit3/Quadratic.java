package unit3;
//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{ 
		setEquation(0,0,0);
		rootOne = 0;
		rootTwo = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		rootOne = 0;
		rootTwo = 0;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		if (Math.pow(b, 2)-4*a*c>=0) {
		rootOne = (double) ((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
		rootTwo = (double) ((-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
		}
	}

    public void print()
    {
    	System.out.print("a = " + a + " ");
    	System.out.print("b = " + b + " ");
    	System.out.println("c = " + c);
    	System.out.printf("rootOne :: %.4f\n", rootOne);
    	System.out.printf("rootTwo :: %.4f\n", rootTwo);
    	System.out.println("\n");
    }
    
    //complete either print or the toString()

	public String toString()
	{
		return "rootOne = " + rootOne + "\n rootTwo = " + rootTwo;
	}
}