package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 
	  window.fillOval(575, 325, 50, 33);
	  window.fillOval(550, 350, 100, 75);
	  window.fillOval(500, 400, 200, 150);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}