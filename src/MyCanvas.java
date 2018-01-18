import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
/**
 * A java.awt.Canvas is a component you can draw on.
 * Override the paint(Graphics) method to draw stuff.
 * Override other methods to add behavior.
 * 
 * @author jim
 *
 */
public class MyCanvas extends Canvas {
	public MyCanvas( ) {
		// nothing to do, yet
	}
	
	public void paint(Graphics g) {
		//TODO g = g.create();
		System.out.println("Painting shapes");
		
		// draw a red square
		Point corner = new Point(10,10);
		int size = 100;
		g.setColor(Color.RED);
		g.drawRect(corner.x, corner.y, size, size);
		
		// draw a blue circle
		int radius = 50;
		Point center = new Point(200, 10+radius);
		g.setColor(Color.BLUE);
		// syntax: drawOver(xTopLeft, yTopLeft, width, height)
		g.drawOval(center.x-radius, center.y-radius, 2*radius, 2*radius);

	}
	
	// How can we add more squares to the drawing?
	public void addSquare(Square square) {
		
	}

}
