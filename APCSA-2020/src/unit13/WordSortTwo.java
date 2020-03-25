package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		for(int i = 1; i<wordRay.length;i++) {
			String temp = wordRay[i];
			int index = i;
			while(index>0 && temp.compareTo(wordRay[index-1])<0) {
				wordRay[index] = wordRay[index-1];
				index--;
			}
			wordRay[index]=temp;
		}
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i< wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}