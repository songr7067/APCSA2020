package consumerlab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		System.out.println(Review.sentimentVal("yes"));
		System.out.println(Review.totalSentiment("src/consumerlab/simpleReview.txt"));
		
		try {
			Scanner input = new Scanner(new File("src/consumerlab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
	}
}