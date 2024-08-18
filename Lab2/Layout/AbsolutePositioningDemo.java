import javax.swing.*;

public class AbsolutePositioningDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Absolute Positioning");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(null); // No layout manager

        JLabel label = new JLabel("Label:");
        label.setBounds(50, 30, 60, 30);
        panel.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(120, 30, 100, 30);
        panel.add(textField);

        JButton button = new JButton("Button");
        button.setBounds(50, 80, 100, 30);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
