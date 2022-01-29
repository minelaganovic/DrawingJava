import java.awt.Canvas;
import java.awt.Color;
import java.awt.*;

import javax.swing.JFrame;

public class Car extends Canvas {

	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Auto");
		Canvas canvas=new Car();
		frame.add(canvas);
		frame.setResizable(false);
		//frame.setBackground(Color.lightGray);
		frame.setSize(500,500);
		frame.setVisible(true);

	}
	public void paint(Graphics g)
	{
		
		 g.setColor(Color.blue);
		 g.fillRect(0,0,500,100);
		 g.setColor(Color.black);
		 g.fillRect(0,100,500,100);
		 g.setColor(Color.green);
		 g.fillRect(0,200,500,300);
		  int x, y;
		  int z=getWidth();
		  x=20; 
		  y=60;
		  
		  Color c1=new Color(20,160,200);
		  Color c2=new Color(200,60,200);
		  g.setColor(c1);
		  g.drawLine(0,y+75,z,y+75);
		  g.setColor(Color.red);
		  g.fillRoundRect(x,y+20,100,40,5,5);
		  g.fillArc(x+90,y+20,20,40,270,180);
		  g.setColor(Color.yellow);
		  g.fillRoundRect(x+10,y,70,25,10,10);
		  g.setColor(Color.white);
		  g.fillRect(x+20,y+5,20,25);
		  g.fillRect(x+50,y+5,20,25);
		  g.setColor(Color.black);
		  g.fillRoundRect(x+55,y+10,10,20,10,10);
		  g.fillOval(x+10,y+50,25,25);
		  g.fillOval(x+60,y+50,25,25);
		  g.setColor(Color.white);
		  g.fillOval(x+15,y+55,10,10);
		  g.fillOval(x+65,y+55,10,10);
	}
	
}
