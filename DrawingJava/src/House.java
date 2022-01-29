import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.JFrame;

public class House extends Canvas {

	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Kucica i Covek");
		Canvas canvas=new House();
		frame.add(canvas);
		frame.setResizable(false);
		frame.setBackground(Color.lightGray);
		frame.setSize(500,500);
		frame.setVisible(true);		
	}
	
	public void paint(Graphics page)
	{
		final int MID=120;
		final int TOP=200;
		
		int []x={90,190,290};
		int []y= {180, 50,180};
		page.setColor(Color.red);
	    //page.drawPolygon(200, 200,100 );
	    page.fillPolygon(x,y, 3);
	    page.fillRect(MID+100, TOP-140, 30, 100);

		page.setColor(Color.yellow);
		page.fillRect(MID-25, TOP-20, 190, 190);
		page.setColor(Color.PINK);
		page.fillRect(MID, TOP,70, 70);
		page.setColor(Color.black);
		page.fillRect(MID+60, TOP+90, 60, 80);
		page.drawRect(MID, TOP,70, 70);
		page.drawLine(MID+35, TOP, MID+35, TOP+70);
		page.drawLine(MID, TOP+35, MID+70, TOP+35);
		
		page.setColor(Color.black);
		page.fillOval(TOP+190, TOP+30, 50, 50);
		page.drawLine(MID+295, TOP+80, MID+295, TOP+120);
		page.drawLine(MID+245, TOP+70, MID+295, TOP+90);
		page.drawLine(MID+345, TOP+70, MID+295, TOP+90);
		 // page.fillArc(60, 125, 80, 40, 180, 180);  // KAko izgledaju usta...


		page.drawLine(MID+245, TOP+170, MID+295, TOP+120);
		page.drawLine(MID+345, TOP+170, MID+295, TOP+120);
		
		page.setColor(Color.white);
		 page.fillOval(MID+280, TOP+50, 5, 5);
		 page.fillOval(MID+310, TOP+50, 5, 5);
		 page.drawArc(MID+280, TOP+60, 35, 5,MID+235, MID+80);
		 
		
	}
}
