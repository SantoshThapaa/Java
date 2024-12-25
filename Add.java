import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Add extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    public Add() {
        // Label for the first number
        l1 = new JLabel("Enter First Number:");
        l1.setBounds(10, 20, 150, 30);
        add(l1);

        // Text field for the first number
        t1 = new JTextField(10);
        t1.setBounds(170, 20, 100, 30);
        add(t1);

        // Label for the second number
        l2 = new JLabel("Enter Second Number:");
        l2.setBounds(10, 60, 150, 30);
        add(l2);

        // Text field for the second number
        t2 = new JTextField(10);
        t2.setBounds(170, 60, 100, 30);
        add(t2);

        // Label for the result
        l3 = new JLabel("Result:");
        l3.setBounds(10, 100, 150, 30);
        add(l3);

        // Text field for the result
        t3 = new JTextField(10);
        t3.setBounds(170, 100, 100, 30);
        t3.setEditable(false); // Make the result field read-only
        add(t3);

        // Button to perform addition
        b1 = new JButton("Click me");
        b1.setBounds(100, 140, 100, 30);
        add(b1);

        // Add ActionListener to the button
        b1.addActionListener(this);

        // Frame properties
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                // Read numbers from text fields
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                // Calculate the sum
                int sum = num1 + num2;
                // Display the result in the result field
                t3.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                // Handle invalid input
                t3.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        new Add();
    }
}
