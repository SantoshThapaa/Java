package Assignment2;

import javax.swing.*;
import java.awt.event.*;

public class MultiplyNumbers extends JFrame {
    public MultiplyNumbers() {
        // Create and set up the frame
        setTitle("Multiply Two Numbers");
        setSize(300, 200);
        setLayout(null);

        // Create text fields for input and output
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Make the result field read-only

        // Create button to trigger multiplication
        JButton multiplyButton = new JButton("Multiply");

        // Set bounds for components
        num1Field.setBounds(20, 20, 100, 30);
        num2Field.setBounds(140, 20, 100, 30);
        multiplyButton.setBounds(80, 70, 120, 30);
        resultField.setBounds(80, 120, 120, 30);

        // Add components to the frame
        add(num1Field);
        add(num2Field);
        add(multiplyButton);
        add(resultField);

        // Action listener for the button
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse input numbers
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    // Calculate multiplication result
                    double result = num1 * num2;

                    // Display result in the result field
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiplyNumbers();
    }
}
