package Assignment2;

import javax.swing.*;
import java.awt.event.*;

public class SimpleInterestCalculator extends JFrame {
    // Declare components
    JTextField principalField, rateField, timeField, interestField;
    JButton calculateButton;

    public SimpleInterestCalculator() {
        // Set up the frame
        setTitle("Simple Interest Calculator");
        setSize(300, 200);
        setLayout(null);

        // Create and position text fields and button
        principalField = new JTextField("Principal");
        principalField.setBounds(20, 20, 120, 25);
        add(principalField);

        rateField = new JTextField("Rate (%)");
        rateField.setBounds(150, 20, 120, 25);
        add(rateField);

        timeField = new JTextField("Time (years)");
        timeField.setBounds(20, 60, 120, 25);
        add(timeField);

        interestField = new JTextField("Interest");
        interestField.setBounds(150, 60, 120, 25);
        interestField.setEditable(false);
        add(interestField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(80, 100, 120, 30);
        add(calculateButton);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(principalField.getText());
                    double rate = Double.parseDouble(rateField.getText());
                    double time = Double.parseDouble(timeField.getText());
                    double interest = (principal * rate * time) / 100;
                    interestField.setText(String.valueOf(interest));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleInterestCalculator();
    }
}
