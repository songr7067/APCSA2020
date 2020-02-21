package unit8;

public class OddToEvenRunner {

	public static void main(String[] args) {
		/*[7,1,5,3,11,5,6,7,8,9,10,12345,11]
		[11,9,8,7,6,5,4,3,2,1,-99,7]
		[10,20,30,40,5,41,31,20,11,7]
		[32767,70,4,5,6,7]
		[2,7,11,21,5,7]
		[7,255,11,255,100,3,2]
		[9,11,11,11,7,1000,3]
		[7,7,7,11,2,7,7,11,11,2]
		[2,4,6,8,8]*/
		int[] ray1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(RayOddToEven.go(ray1));
		int[] ray2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(RayOddToEven.go(ray2));
		int[] ray3 = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(RayOddToEven.go(ray3));
		int[] ray4 = {32767,70,4,5,6,7};
		System.out.println(RayOddToEven.go(ray4));
		int[] ray5 = {2,7,11,21,5,7};
		System.out.println(RayOddToEven.go(ray5));
		int[] ray6 = {7,255,11,255,100,3,2};
		System.out.println(RayOddToEven.go(ray6));
		int[] ray7 = {9,11,11,11,7,1000,3};
		System.out.println(RayOddToEven.go(ray7));
		int[] ray8 = {7,7,7,11,2,7,7,11,11,2};
		System.out.println(RayOddToEven.go(ray8));
		int[] ray9 = {2,4,6,8,8};
		System.out.println(RayOddToEven.go(ray9));
	}

}
