package Lab2.Layout;
import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JButton("Button 3"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JButton("Button 4"), gbc);

        frame.setVisible(true);
    }
}
