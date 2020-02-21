package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddIndex = -1;

		for (int i = 0; i < ray.length; i++) {
			if (ray[i]%2!=0) {
				oddIndex =i;
				break;
			}
		}
		if (oddIndex<0) {
			return -1;
		}
		for (int i = oddIndex; i < ray.length; i++) {
			if (ray[i]%2==0)
				return i-oddIndex;
		}
		return -1;
	}
}