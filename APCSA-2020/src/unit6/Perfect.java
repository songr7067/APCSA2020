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
		int total = 1;
		int i = 2;
		do {
			if (number%i == 0)
				total += i;
			i++;
		}while(i<number);
		if (total == number) {
			return true;
		}
		else 
			return false;
	}

	//add a toString	
	public String toString() {
		if (isPerfect()) 
			return number + " is perfect.\n";
		else 
			return number + " is not perfect.\n";
			
	}
}