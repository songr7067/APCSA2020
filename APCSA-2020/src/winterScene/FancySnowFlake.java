package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		// TODO Auto-generated constructor stub
	}
	
	public FancySnowFlake(int x, int y, int wid, int ht, Color col) {
		// TODO Auto-generated constructor stub
		super(x,y,wid,ht,col);
	}
	
	public FancySnowFlake(int x, int y, int wid, int ht, Color col,int xSpd, int ySpd) {
		// TODO Auto-generated constructor stub
		super(x,y,wid,ht,col,xSpd,ySpd);
	}
	
	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		//int[] xPoints = {super.getXPos(),super.getXPos()+super.getWidth(),super.getXPos()+super.getWidth()/2};
		//int[] yPoints = {super.getYPos(),super.getYPos(),super.getYPos()-super.getHeight()};
		window.drawOval(super.getXPos(), super.getYPos(), super.getWidth(), super.getHeight());
		//window.fillPolygon(xPoints, yPoints, 3);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		super.setXPos(super.getXPos()+ (int) (Math.random()*10) - (int) (Math.random()*10));
		super.setYPos(super.getYPos()+super.getYSpeed());
		if(super.getXPos()>790) {
			super.setXPos((int) (Math.random()*700)+50);
		}
		int[] xPoints1 = {super.getXPos(),super.getXPos()+super.getWidth(),super.getXPos()+super.getWidth()/2};
		int[] yPoints1 = {super.getYPos(),super.getYPos(),super.getYPos()+super.getHeight()};
		int[] xPoints2 = {super.getXPos(),super.getXPos()+super.getWidth(),super.getXPos()+super.getWidth()/2};
		int[] yPoints2 = {super.getYPos()+super.getHeight()/2,super.getYPos()+super.getHeight()/2,super.getYPos()-super.getHeight()/2};
		//window.drawOval(super.getXPos(), super.getYPos(), super.getWidth(), super.getHeight());
		window.drawPolygon(xPoints1, yPoints1, 3);
		window.drawPolygon(xPoints2, yPoints2, 3);
	}
	
	
}

