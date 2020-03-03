package elevenlab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//make a Deck class
public class Deck
{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	private int size;
	
	
   //make a Deck constructor
	public Deck() {
		top = size-1;
	cards = new ArrayList<Card>();
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
		for (int i =0; i<4;i++) {
			for (int k =1;k<=13;k++){
				cards.add(0,new Card(SUITS[i],k));
			}
		}
	}
   
	public Deck(String[]ranks, String[]suits, int[] pointValues) {
		cards = new ArrayList<Card>();
		for(int s = 0; s<suits.length; s++) {
			for ( int r = 0; r<ranks.length;r++) {
				cards.add(new Card(ranks[r],suits[s], pointValues[r]));
			}
		}
		size = cards.size();
		top = size-1;
		shuffle();
	}
	
   //make a dealCard() method that returns the top card
	public Card dealCard() {
		Card output = null;
		if (top<0) {
			resetTop();
			top = size -1;
		}
		if(top>=0) {
		output = cards.get(top);
		top--;
		size--;
		}
		return output;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}

	public int size() {
		return size;
	}
	
	public void resetTop() {
		size = cards.size();
		top = size-1;
	}
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public String toString() {
		String output = "size = " + size + "\nUndealt cards: \n";
		for (int i = size-1; i>=0;i--) {
			if (i>0) {
				output += cards.get(i) + ", ";
			}
			else 
				output += cards.get(i) + "\n";
		}
		output += "\nDealt cards: \n";
		for (int k = cards.size()-1;k>=size;k--) {
			if (k>size) {
				output += cards.get(k) + ", ";
			}
			else 
				output += cards.get(k) + "\n";

		}
		return output;
	}
}
