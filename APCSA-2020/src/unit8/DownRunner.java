package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		/*[-99,1,2,3,4,5,6,7,8,9,10,12345]
			[10,9,8,7,6,5,4,3,2,1,-99]
			[10,20,30,40,50,-11818,40,30,20,10]
			[32767]
			[255,255]
			[9,10,-88,100,-555,1000]
			[10,10,10,11,456]
				[-111,1,2,3,9,11,20,30]
				[9,8,7,6,5,4,3,2,0,-2,-989]
				[12,15,18,21,23,1000]
				[250,19,17,15,13,11,10,9,6,3,2,1,-455]
				[9,10,-8,10000,-5000,1000]*/
		int[] ray1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		 System.out.println(RayDown.go(ray1));
		 int[] ray2 = {10,9,8,7,6,5,4,3,2,1,-99};
		 System.out.println(RayDown.go(ray2));
		 int[] ray3 = {10,20,30,40,50,-11818,40,30,20,10};
		 System.out.println(RayDown.go(ray3));
		 int[] ray4 = {32767};
		 System.out.println(RayDown.go(ray4));
		 int[] ray5 = {255,255};
		 System.out.println(RayDown.go(ray5));
		 int[] ray6 = {9,10,-88,100,-555,1000};
		 System.out.println(RayDown.go(ray6));
		 int[] ray7 = {10,10,10,11,456};
		 System.out.println(RayDown.go(ray7));
		 int[] ray8 = {-111,1,2,3,9,11,20,30};
		 System.out.println(RayDown.go(ray8));
		 int[] ray9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		 System.out.println(RayDown.go(ray9));
		 int[] ray10 = {12,15,18,21,23,1000};
		 System.out.println(RayDown.go(ray10));
		 int[] ray11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		 System.out.println(RayDown.go(ray11));
		 int[] ray12 = {9,10,-8,10000,-5000,1000};
		 System.out.println(RayDown.go(ray12));
	}
}