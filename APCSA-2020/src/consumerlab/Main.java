package consumerlab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		System.out.println(Review.sentimentVal("cold"));
		System.out.println(Review.sentimentVal("hot"));
		System.out.println(Review.sentimentVal("warm"));
		System.out.println(Review.totalSentiment("src/consumerlab/simpleReview.txt"));
		System.out.println(Review.starRating("src/consumerlab/simpleReview.txt"));
		System.out.println(Review.fakeReview("src/consumerlab/simpleReview.txt"));
		
		try {
			Scanner input = new Scanner(new File("src/consumerlab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
	}
}