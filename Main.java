import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends Applet implements Runnable {
    
    private Thread t = null;
    private int row, column;
    private ArrayList<Block> blocks = new ArrayList<>();
    private int counter = 0;
    
    public void init() {
        setBackground(Color.black);
    }
    
    public void paint(Graphics g) {
        for(int i = 0; i < blocks.size(); i++) {
            blocks.get(i).draw(g);
        }
    }
    
    public void run() {
        while(true) {
            row = (int) (Math.random() * 20);
            column = (int) (Math.random() * 20);
            
            int width = 20;
            int height = 20;
        
            int space = width;
       
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color col = new Color(red, green, blue);
            
            Block b = new Block(space * row, space * column, width, height, col);
            blocks.add(b);
            
            repaint();
            try {
                Thread.sleep(100);
            } catch(Exception e) {}
        }
    }
    
    public void start() {
        t = new Thread(this);
        t.start();
    }
}