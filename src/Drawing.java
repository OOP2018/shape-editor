import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * A frame that displays a Canvas.
 * JFrame is a window with title bar and a content pane.
 * You can add components in the ContentPane, which is a Container object.
 * 
 * @author jim
 *
 */
public class Drawing extends JFrame {
	// where we will draw stuff.
	private MyCanvas canvas;
	
	public Drawing( ) {
		setTitle("Shape Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
	}

	/**
	 * Add the canvas to the window and resize it.
	 */
	private void initComponents() {
		canvas = new MyCanvas();
		// make sure the window isn't too small or too large
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		//Dimension size = new Dimension(screensize.width/2, screensize.height/2);
		Dimension size = new Dimension(300, 300);
		canvas.setPreferredSize(size);
		// add canvas to the frame's ContentPane and resize frame to fit
		this.add(canvas);
		this.pack();
	}
	
	public MyCanvas getCanvas() {
		return canvas;
	}
}
