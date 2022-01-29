import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Face extends Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame("Smej se smej!");
		  Canvas canvas = new Face();
		  frame.add(canvas);
		  frame.pack();
		  frame.setSize(400, 400);
		  frame.setVisible(true);
	}
	public void paint(Graphics page)
	{
		 final int MID = 170;
		 final int TOP = 70;
		
		 setBackground(Color.red);
		 page.setColor(Color.white);
		 page.fillOval(MID-45, TOP+40, 30, 30);
		 page.fillOval(MID+90, TOP+40, 30, 30);
		 page.fillOval(MID-20, TOP, 120, 120);
		 
		 page.setColor(Color.YELLOW);
		 page.fillOval(MID+10, TOP+40, 20, 20);
		 page.fillOval(MID+60, TOP+40, 20, 20);
		 
		 page.setColor(Color.black);
		 page.fillOval(MID+40, TOP+55, 14, 14);
		 
		 page.setColor(Color.black);
		 page.fillOval(MID+20, TOP+50, 5, 5);
		 page.fillOval(MID+65, TOP+50, 5, 5);
		 
		 page.setColor(Color.black);
		 page.drawLine(MID+20, TOP+80, MID+75, TOP+80);
		 page.drawArc(MID+20, TOP+70, 55, 20, 190, 160);//usta
	}
}
