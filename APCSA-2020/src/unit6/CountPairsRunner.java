package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		//add in all of the provided test cases from the lab handout	
		//ddogccatppig
		System.out.println(CountPairs.pairCounter("ddogccatppig"));
		//dogcatpig
		System.out.println( CountPairs.pairCounter("dogcatpig") );
		//xxyyzz
		System.out.println( CountPairs.pairCounter("xxyyzz") );
		//a
		System.out.println( CountPairs.pairCounter("a") );
		//abc
		System.out.println( CountPairs.pairCounter("abc") );
		//aabb
		System.out.println( CountPairs.pairCounter("aabb") );
		//dogcatpigaabbcc
		System.out.println( CountPairs.pairCounter("dogcatpigaabbcc") );
		//aabbccdogcatpig
		System.out.println( CountPairs.pairCounter("aabbccdogcatpig") );
		//dogabbcccatpig
		System.out.println( CountPairs.pairCounter("dogabbcccatpig") );
		//aaaa
		System.out.println( CountPairs.pairCounter("aaaa") );
		//AAAAAAAAA
		System.out.println( CountPairs.pairCounter("AAAAAAAAA") );
	}
}