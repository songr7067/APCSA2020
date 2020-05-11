package starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a:aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien a:aliens) {
			a.move("DOWN");
			if((int) (Math.random()*2)==0) {
				a.move("RIGHT");
			}
			
			else {
				a.move("LEFT");
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(Alien a:aliens) {
			for(Ammo s: shots) {
				if( (a.getY()+a.getHeight()<=s.getY()+s.getHeight())&&
						( (a.getX()<=s.getX()&&a.getX()+a.getWidth()>=s.getX())||(a.getX()<=s.getX()+s.getWidth()&&a.getX()+a.getWidth()>=s.getX()) ) ) {
					aliens.remove(a);
					shots.remove(s);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
