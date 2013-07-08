import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
	box.setMovementVector(1,1);

	boxes = new ArrayList<BouncingBox>();
	boxes.add(new BouncingBox(35,40, Color.BLUE));
	boxes.get(0).setMovementVector(2,-1);
	boxes.add(new BouncingBox(120,80, Color.GREEN));
	boxes.get(1).setMovementVector(-1,2);
	boxes.add(new BouncingBox(500,80, Color.PINK));
	boxes.get(2).setMovementVector(-2,-2);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
	surface.drawOval(20,20,40,40);
        box.draw(surface);
	for (BouncingBox b : boxes) {
	    b.draw(surface);
	}
    }
} 
