package Assignment2;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo() {
        // Set the frame title and layout
        setTitle("BorderLayout Example");
        setLayout(new BorderLayout());

        // Add buttons to different regions of the BorderLayout
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);

        // Set frame size, close operation, and visibility
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}

