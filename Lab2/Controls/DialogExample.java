package Lab2.Controls;
import javax.swing.*;

public class DialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Show Dialog");
        button.setBounds(150, 100, 120, 30);
        frame.add(button);

        button.addActionListener(e -> {
            // Creating a JDialog
            JDialog dialog = new JDialog(frame, "Dialog Box", true);
            dialog.setSize(200, 100);
            dialog.setLayout(null);

            JLabel label = new JLabel("This is a dialog");
            label.setBounds(50, 20, 100, 30);
            dialog.add(label);

            dialog.setVisible(true);
        });

        frame.setVisible(true);
    }
}

