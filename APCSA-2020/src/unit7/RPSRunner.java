package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			System.out.print("type in your prompt [R,P,S] :: ");
			player = keyboard.next();
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(player);		
			
			System.out.println(game);
			game.setPlayers("R");
			System.out.println(game);
			game.setPlayers("R");
			System.out.println(game);
			game.setPlayers("S");
			System.out.println(game);
			game.setPlayers("S");
			System.out.println(game);
			game.setPlayers("P");
			System.out.println(game);
			game.setPlayers("P");
			System.out.println(game);
			
			
			
			String response;
			do {
				System.out.println("Would you like to play again (y/n): ");
				response = keyboard.next();
				System.out.print("type in your prompt [R,P,S] :: ");
				player = keyboard.next();
				game.setPlayers(player);
				System.out.println(game + "\n");
			}while (response.equalsIgnoreCase("y"));
			
	}
}



