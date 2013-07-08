import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class DrawGraphics {
    Bouncer movingSprite;
    ArrayList<Bouncer> bouncers;

    /** Initializes this class for drawing. **/
    public DrawGraphics() {
        bouncers = new ArrayList<Bouncer>();
	bouncers.add(new Bouncer(100, 170, new Rectangle(15, 20, Color.RED)));
	bouncers.add(new Bouncer(150, 230, new Rectangle(25, 25, Color.BLUE)));
	bouncers.add(new Bouncer(40, 30, new CustomShapeOne(20, 20, Color.GREEN)));
	
	Random random = new Random();
	for (Bouncer b : bouncers) {
	    b.setMovementVector(random.nextInt(10)-5, random.nextInt(10)-5);
	}
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
	for (Bouncer b : bouncers) {
	    b.draw(surface);
	}
    }
}
