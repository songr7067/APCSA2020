package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	 m = new String[size][size];
    	 for(int i = 0; i<size;i++) {
    		 for(int j = 0; j<size; j++) {
    			 m[i][j]= str.charAt(i*8+j) + "";
    		 }
    	 }
    }

    public boolean isFound( String word )
    {
    	String first = word.charAt(0) + "";
    	for(int row = 0; row< m.length; row++ ) {//rows
    		for(int col = 0; col< m[0].length; col++) {//cols
    			if(m[row][col].equals(first)){//find first letter
    				
    				//check Right
    				if(col+word.length()<m[0].length+1) {
    					if(checkRight(word,row,col)) {
    						return true;
    					}
    				}//end check Right
    				
    				//check left
    				if(col-word.length()>=-1) {
    						if(checkLeft(word,row,col)) {
    							return true;
    						}
    				}//end check Left
    				
    				//check Up
    				if(row-word.length()>=-1) {
    						if(checkUp(word,row,col)) {
    							return true;
    						}
    				}//end check Up
    				
    				//check Down
    				if(row+word.length()<m.length+1) {
							if(checkDown(word,row,col)) {
								return true;
							}
    				}//end check Down
    				
    				//Check Up Right
    				if(row-word.length()>=-1&&col+word.length()<m[0].length+1) {
						if(checkDiagUpRight(word,row,col)) {
							return true;
						}
    				}//end check DiagUpRight
    				
    				//Check Up Left
    				if(row-word.length()>=-1&&col-word.length()>=-1) {
						if(checkDiagUpLeft(word,row,col)) {
							return true;
						}
    				}//end check DiagUpLeft
    				
    				//Check Down Left
    				if(row+word.length()<m.length+1&&col-word.length()>=-1) {
						if(checkDiagDownLeft(word,row,col)) {
							return true;
						}
    				}//end check DiagDownLeft
    				
    				//Check Down Right
    				else if(row+word.length()<m.length+1&&col+word.length()<m[0].length+1) {
						if(checkDiagDownRight(word,row,col)) {
							return true;
						}
    				}//end check DiagDownRight
    			}//end first if
    		}//end col
    	}//end rows
    	
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		boolean output = true;
		for(int i = 1; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r][c+i]) ) {
				return false;
			}
		}
		return output;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		boolean output = true;
		for(int i = 1; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r][c-i]) ) {
				return false;
			}
		}
		return output;
	}

	public boolean checkUp(String w, int r, int c)
	{
		boolean output = true;
		for(int i = 0; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r-i][c]) ) {
				return false;
			}
		}
		return output;
	}

	public boolean checkDown(String w, int r, int c)
   {
		boolean output = true;
		for(int i = 0; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r+i][c]) ) {
				return false;
			}
		}
		return output;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		boolean output = true;
		for(int i = 0; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r-i][c+i]) ) {
				return false;
			}
		}
		return output;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		boolean output = true;
		for(int i = 0; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r-i][c-i]) ) {
				return false;
			}
		}
		return output;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		boolean output = true;
		for(int i = 0; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r+i][c-i]) ) {
				return false;
			}
		}
		return output;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		boolean output = true;
		for(int i = 0; i<w.length(); i++) {
			if(!(w.charAt(i) + "").equals(m[r+i][c+i]) ) {
				return false;
			}
		}
		return output;
	}

    public String toString()
    {
    	String output = "";
    	for(int row = 0; row<m.length;row++) {
    		for(int col = 0; col<m[0].length;col++) {
    			output += m[row][col] + " ";
    		}
    		output += "\n";
    	}
 		return output;
    }
}
