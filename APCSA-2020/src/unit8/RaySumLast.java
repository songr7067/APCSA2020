package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int last = ray[ray.length-1];
		int greaterThan = 0;
		if (ray.length>0) {
		for (int i = 0; i < ray.length; i++) {
			if (ray[i]>last) {
				greaterThan +=ray[i];
			}
			
		}
		if (greaterThan ==0) {
			return -1;
		}
		return greaterThan;
	
		}
		return -1;
	}
}