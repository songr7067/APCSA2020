package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;
	//write two constructors
	public Rational() {
		numerator = 1;
		denominator = 1;
	}

	public Rational(int numOne, int numTwo) {
		setRational(numOne, numTwo);
	}
	//write a setRational method
	public void setRational(int numOne, int numTwo) {
		numerator = numOne;
		denominator = numTwo;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int num) {
		numerator = num;
	}
	
	public void setDenominator(int num) {
		denominator = num;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numerator = (numerator * other.denominator + other.numerator * denominator);
		denominator = (other.denominator * denominator);
		reduce();
	}

	private void reduce()
	{
		int divisor = gcd(numerator,denominator);
		do {
		numerator /=divisor;
		denominator /= divisor;
		divisor = gcd(numerator,denominator);
		}while (gcd(numerator,denominator)!=1);
	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for (int i  = min; i>1;i--) {
			if(numOne%i==0&&numTwo%i==0) {
				return i;
			}
		}
		return 1;
	}

	public Object clone ()
	{
		Rational clone = new Rational(numerator,denominator);
		return clone;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		Rational other = (Rational) obj;
		other.reduce();
		reduce();
		if(numerator==other.numerator&&denominator==other.denominator) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		int num1 = other.numerator*getDenominator();
		int num2 = getNumerator()*other.denominator;
		if (num1>num2) {
			return -1;
		}
		else if(num1==num2) {
			return 0;
		}
		return 1;
	}
	
	//write  toString() method
	public String toString() {
		String output = "";
		output = numerator + "/" + denominator;
		return output;
	}
	
	
}