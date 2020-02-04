package unit3;
//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
		setSides(a,b,c);

	}


	public void setSides(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		perimeter = sideA+sideB+sideC;
	}

	public void calcArea( )
	{
		double s = (double) perimeter/2;
		theArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}

	public void print() 
	{
		System.out.print("\n" + sideA + " ");
		System.out.print(sideB + " ");
		System.out.println(sideC);
		System.out.printf("Area == %.5f\n", theArea);
	}
	
	//create a print method or toString or both
	
	public String toString()
	{
		return "";
	}
}