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
	
	
   //make a Deck constructor
	public Deck() {
		top = 51;
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
   
   //make a dealCard() method that returns the top card
	public String dealCard() {
		if (top<0) {
			top =51;
		}
		String output = cards.get(top).toString();
		top--;
		return output;
	}
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
	public void shuffle() {
		Collections.shuffle(cards);
		top = 51;
	}
}
