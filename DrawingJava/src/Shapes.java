import java.awt.*;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class Shapes extends Canvas{
	public static void main(String [] args)
	{
		JFrame frame=new JFrame("Razliciti zadaci");
		Canvas canvas= new Shapes();
		frame.add(canvas);
		//frame.setResizable(false);
		frame.pack();
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	 public void paint(Graphics g)
	 {
		 setBackground(Color.yellow);
		 
		 int sirina=getWidth(),visina=getHeight();
			g.drawLine(0,0,sirina-1,visina-1);
			g.translate(sirina-1-sirina/3,0);
			g.setColor(Color.RED); 
			g.fillRect(0,0,sirina/3, visina/3);
			g.setColor(Color.GREEN); 
			g.drawRect(0,0,sirina/3, visina/3);
			g.translate(-sirina+1+sirina/3,visina-1-visina/3);
			g.setColor(Color.BLACK); 
			g.fillOval(0,0, sirina/3, visina/3);
			g.setColor(Color.BLUE); 
			g.drawOval(0,0, sirina/3, visina/3);
	 }
}
