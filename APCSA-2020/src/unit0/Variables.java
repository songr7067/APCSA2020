package unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class Variables
{
	public static void main ( String[] args )
	{
		System.out.println("Raymond\t 01/31/2020");
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		short shortOne = Short.MAX_VALUE;
		int intOne = Integer.MAX_VALUE;
		long longOne = Long.MAX_VALUE;
		
		//decimal variables
		float floatOne = Float.MAX_VALUE;
		double doubleOne = Double.MAX_VALUE;
		

		//other types
		char charOne = 'A';
		boolean boolOne = true;
		String stringOne =  "My mother is a fish";

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = " + shortOne);
		System.out.println("*32 bit - intOne = " + intOne);
		System.out.println("*64 bit - longOne = " + longOne);
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        decimal types          *");
		System.out.println("*                               *");
		System.out.println("Float :) = " + floatOne);
		System.out.println("Double :) = " + doubleOne);
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        other types          *");
		System.out.println("*                               *");
		System.out.println("Character = " + charOne);
		System.out.println("Boolean = " + boolOne);
		System.out.println("String = " + stringOne);


	}
}