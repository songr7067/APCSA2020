package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore9
{
	private ArrayList<Toy> toyList;

	public ToyStore9()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		int indexOf = toys.indexOf(" ");
		toyList.add(new Toy(toys.substring(0,indexOf)));
		while (indexOf>0) {
			
			Toy newToy = new Toy(toys.substring(0,indexOf));
			String toyName = toys.substring(0,indexOf);
			
			for(int i = 0; i<toyList.size();i++) {
				if(toyList.get(i).getName().equals(toyName)) {
					newToy.setCount(newToy.getCount()+1);
					break;
				}
				}
				toyList.add(newToy);
				toyList.get(1).setCount(1);
				}
			toys = toys.substring(indexOf+1);
			indexOf = toys.indexOf(" ");
			
		}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toy : toyList) {
			if(toy.getName().equals(nm)) {
				return toy;
			}
		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int greatest = 0;
  		for(int i = 0; i<toyList.size();i++) {
  			if(toyList.get(i).getCount()>toyList.get(greatest).getCount()) {
  				greatest = i;
  			}
  		}
  		return toyList.get(greatest).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
  	
  	public void myName(){
  		System.out.println("Raymond Song");
  		}
  	
	public String toString()
	{
		String output = "";
		for(int i = 0; i<toyList.size();i++) {
			output += toyList.get(i).toString() + " ";
		}
	   return output;
	}
}