package Lab2.Controls;
import javax.swing.*;

public class JLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("This is a JLabel");
        label.setBounds(50, 50, 150, 30);
        frame.add(label);

        frame.setVisible(true);
    }
}
