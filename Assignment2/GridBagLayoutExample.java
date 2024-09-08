package Assignment2;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {
    public GridBagLayoutExample() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Adding buttons with minimal configuration
        add(new JButton("Button 1"), gbc); // Default position (0, 0)
        gbc.gridx = 1; add(new JButton("Button 2"), gbc); // Position (1, 0)
        gbc.gridx = 0; gbc.gridy = 1; add(new JButton("Button 3"), gbc); // Position (0, 1)
        gbc.gridx = 1; add(new JButton("Button 4"), gbc); // Position (1, 1)
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2; add(new JButton("Button 5"), gbc); // Span 2 columns

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
