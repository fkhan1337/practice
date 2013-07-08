import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class CustomShapeOne implements Sprite {
    /*
      Custom Shape definition from Sprite
    */

    private int width;
    private int height;
    private Color color;

    public CustomShapeOne(int width, int height, Color color) {
	this.width = width;
	this.height = height;
	this.color = color;
    }

    public void draw(Graphics surface, int leftX, int topY) {
	surface.setColor(color);
	((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
	surface.drawOval(leftX, topY, width, height);
    }
    
    public int getWidth() {
	return width;
    }

    public int getHeight() {
	return height;
    }
}
