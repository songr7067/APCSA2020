package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		
	}

	public void calcMPH()
	{
		double totalHours = (double) minutes/60 + hours; 
		mph = distance /totalHours;
	}

	public void print()
	{
		System.out.printf(distance + " miles in " + hours + " hour and " + minutes + " minutes =  " + String.format("%.0f", mph) + " MPH");
		System.out.println();
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance + " miles in " + hours + " hour and " + minutes + " minutes =  " + String.format("%.0f", mph) + " MPH";
	}
}