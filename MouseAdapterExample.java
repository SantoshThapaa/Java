import java.awt.*;
import java.awt.event.*;
public class MouseAdapterExample extends MouseAdapter{
    Frame f;
    MouseAdapterExample(){
        f = new Frame("Mouse Adapter");
        f.addMouseListener(this);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g=f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}