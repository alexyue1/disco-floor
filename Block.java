import java.awt.*;
import java.applet.Applet;

public class Block extends Applet {
    
    private int startX, startY;
    private int width, height;
    private Color c;
    
    public Block(int startX, int startY, int width, int height, Color c) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        this.c = c;
    }
    
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(startX, startY, width, height);
    }
    
    public int getStartX() {
        return startX;
    }
    
    public int getStartY() {
        return startY;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
}