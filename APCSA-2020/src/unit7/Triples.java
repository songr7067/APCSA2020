package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	public String checkTriple() {
		String output = "";
		for (int a = 1; a<number;a++) {
			for (int b = a;b<number;b++) {
				for (int c = b; c<number; c++) {
					if(checkTriple(a,b,c)&&checkOddEven(a,b,c)&&greatestCommonFactor(a,b,c)==1)
						output = output + a + " " + b + " " + c + "\n";
				}
			}
		}
		return output;
	}
	private boolean checkTriple(int a, int b, int c) {
		if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2))
			return true;
		else
			return false;
	}
	
	private boolean checkOddEven(int a, int b, int c) {
		if (c%2==0)
			return false;
		if (a%2!=0&&b%2==0||a%2==0&&b%2!=0)
			return true;
		else 
			return false;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i =1;i<number;i++) {
			if (a%i==0&&b%i==0&&c%i==0) {
				max = i;
			}
		}


		return max;
	}
	

	public String toString()
	{
		String output="";

		output =checkTriple();




		return output+"\n";
	}
}