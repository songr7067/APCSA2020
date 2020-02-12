package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int n) {
	  setNumber(n);
   }

	//add a set method
   public void setNumber(int n) {
	   number = n;
   }

	public boolean isPerfect()
	{
		int total = 0;
		for (int i = 1; i<number; i++) {
			if (number%i==0) {
				total += number;
			}
		}
		if (total == number) {
			return true;
		}
		else 
			return false;
	}

	//add a toString	
	public String toString() {
		if (isPerfect()) 
			return number + " is perfect.";
		else 
			return number + " is not perfect.";
			
	}
}