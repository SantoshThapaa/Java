import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        frame.setLayout(new GridLayout(2, 2)); // GridLayout with 2 rows, 2 columns

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));

        frame.setVisible(true);
    }
}
