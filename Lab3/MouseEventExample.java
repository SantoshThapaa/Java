package Lab3;

import java.awt.*;  
import java.awt.event.*;  

public class MouseEventExample extends Frame implements MouseListener {  
    Label label;  
    TextArea area;  

    MouseEventExample() {  
        // Create the frame, label, and text area
        label = new Label();  
        label.setBounds(20, 50, 200, 20);  
        area = new TextArea();  
        area.setBounds(20, 80, 300, 300);  

        // Add MouseListener to the text area
        area.addMouseListener(this);  

        // Add components to the frame
        add(label);  
        add(area);  
        setSize(400, 400);  
        setLayout(null);  
        setVisible(true);  
    }  

    // Implement MouseListener methods
    public void mouseClicked(MouseEvent e) {  
        label.setText("Mouse Clicked");  
    }  

    public void mouseEntered(MouseEvent e) {  
        label.setText("Mouse Entered");  
    }  

    public void mouseExited(MouseEvent e) {  
        label.setText("Mouse Exited");  
    }  

    public void mousePressed(MouseEvent e) {  
        label.setText("Mouse Pressed");  
    }  

    public void mouseReleased(MouseEvent e) {  
        label.setText("Mouse Released");  
    }  

    public static void main(String[] args) {  
        new MouseEventExample();  
    }  
}
