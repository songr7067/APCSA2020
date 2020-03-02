package elevenlab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	private String suit;
	private int face;
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	private String rank; 
	private int pointValue;

  	//constructors
	public Card() {
		setSuit("NULL");
		setRank("NULL");
		setPointValue(0);
	}
	
	public Card(String s, int f) {
		setSuit(s);
		setFace(f);
	}
	
	public Card(String r, String s, int pV) {
		setRank(r);
		setSuit(s);
		setPointValue(pV);
	}

	// modifiers
		//set methods
	public void setSuit(String s) {
		suit = s;
	}
	public void setFace(int f) {
		face = f;
	}
	public void setRank(String r) {
		rank = r;
	}
	public void setPointValue(int pV) {
		pointValue = pV;
	}

  	//accessors
		//get methods
	public String getSuit() {
		return suit;
	}
	public int getFace() {
		return face;
	}
	public String getRank() {
		return rank;
	}
	public int getPointValue() {
		return pointValue;
	}
	
	public boolean matches(Card otherCard) {
		if(this.getSuit().equals(otherCard.getSuit())&&this.getRank().equals(otherCard.getRank())&&this.getPointValue()==otherCard.getPointValue()) {
			return true;
		}
			else {
				return false;
			}
		}
	
	
  	//toString
	public String toString() {
		String output = "";
		if(pointValue>0) {
			output = getRank() + " of " + getSuit();
		}
		else 
			output = FACES[getFace()] + " of " + getSuit();
		return output; 
	}
	

 }