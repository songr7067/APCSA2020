package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for(int i = 0; i<ray.size()-1;i++) {
			if (ray.get(i)%2!=0) {
				for(int k = ray.size()-1; k>i;k--) {
					if(ray.get(k)%2==0) {
						return k-i;
					}//end inner if
				}//end inner for
			}//end outer if
		}//end outer for :) 
		return -1;
	}
}