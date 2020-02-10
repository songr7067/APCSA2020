package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.printf("Bill after discount :: %.2f \n\n", Discount.getDiscountedBill(amt));
		
		amt = 500;
		System.out.println("Bill amount :: " + amt);
		System.out.printf("Bill after discount :: %.2f \n\n", Discount.getDiscountedBill(amt));
		
		amt = 2500;
		System.out.println("Bill amount :: " + amt);
		System.out.printf("Bill after discount :: %.2f \n\n", Discount.getDiscountedBill(amt));
		
		amt = 4000;
		System.out.println("Bill amount :: " + amt);
		System.out.printf("Bill after discount :: %.2f \n\n", Discount.getDiscountedBill(amt));
		
		amt = 333.333;
		System.out.println("Bill amount :: " + amt);
		System.out.printf("Bill after discount :: %.2f \n\n", Discount.getDiscountedBill(amt));
		
		amt = 95874.2154;
		System.out.println("Bill amount :: " + amt);
		System.out.printf("Bill after discount :: %.2f \n\n", Discount.getDiscountedBill(amt));
		

	}
}