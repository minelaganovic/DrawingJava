import java.awt.Canvas;
import java.awt.*;
import javax.swing.JFrame;

public class Meta extends Canvas {
		
  public static void main(String[] args) {
			// TODO Auto-generated method stub
			 JFrame frame = new JFrame("Meta");
			  Canvas canvas = new Meta();
			  frame.add(canvas);
			  frame.pack();
			  frame.setSize(400, 400);
			  frame.setVisible(true);
		}
		public void paint(Graphics page)
		{
		final int MAX_SIRINA = 300, BR_PRSTENA = 5, SIRINA_PRSTENA =25;
		int x = 30, y = 30, poluprecnik;
		setBackground(Color.lightGray);
		poluprecnik = MAX_SIRINA;
		page.setColor(Color.white);
		for (int i = 0; i < BR_PRSTENA ; i++ )
		{
		if(page.getColor() == Color.black)
		page.setColor(Color.white);
		else
		page.setColor(Color.black);
		page.fillOval(x, y, poluprecnik, poluprecnik);
		poluprecnik -= (2 * SIRINA_PRSTENA);
		x += SIRINA_PRSTENA;
		y += SIRINA_PRSTENA;
		}
		page.setColor(Color.red);
		page.fillOval(x, y, poluprecnik, poluprecnik);	

	}
}
