package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public String letterPattern() {
		String output = "";
		int totalChar = amount;						//temp amount
		int totalLetters = amount;					//temp amount
		char tempChar = letter;						//temp letter
		for (int i = amount;i>0;i--) {				//i represents the row number
			for (int k = totalChar; k>0; k--) {		//k represents the amount of distinct characters
				for (int j = totalLetters; j>0; j--) {	//j represents the number of letters being printed out
					output = output + tempChar; 	//prints out letters
				}
				output += " "; 						//adds a space between different characters
				if (tempChar!='Z')
					tempChar++; 					//changes the character
				else tempChar = 'A';
				totalLetters--; 					//decreases the amount of letters printed by 1 every time
			}
			totalLetters = amount;					//resets the amount of letters 
			tempChar = letter;						//resets tempChar to the original letter
			totalChar--;							//decreases the amount of characters used
			output = output + "\n";					//adds row
		}
		return output;
	}

	public String toString()
	{
		String output="";
		output = letterPattern();
		return output;
	}
}