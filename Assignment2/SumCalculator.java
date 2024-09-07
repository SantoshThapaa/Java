package Assignment2;

import javax.swing.*;  
import java.awt.event.*;  

public class SumCalculator extends JFrame {  
    JTextField num1Field, num2Field, resultField;  
    JLabel label1, label2, labelResult;  

    SumCalculator() {  
        // Create labels and text fields
        label1 = new JLabel("Number 1:");  
        label1.setBounds(20, 20, 80, 30);  
        num1Field = new JTextField();  
        num1Field.setBounds(100, 20, 150, 30);  

        label2 = new JLabel("Number 2:");  
        label2.setBounds(20, 60, 80, 30);  
        num2Field = new JTextField();  
        num2Field.setBounds(100, 60, 150, 30);  

        labelResult = new JLabel("Sum:");  
        labelResult.setBounds(20, 100, 80, 30);  
        resultField = new JTextField();  
        resultField.setBounds(100, 100, 150, 30);  
        resultField.setEditable(false);  // Result field should be read-only

        // Add KeyAdapter to handle key events for both input fields
        KeyAdapter keyAdapter = new KeyAdapter() {  
            public void keyReleased(KeyEvent e) {  
                calculateSum();  // Call method to calculate the sum
            }  
        };  

        num1Field.addKeyListener(keyAdapter);  
        num2Field.addKeyListener(keyAdapter);  

        // Add components to the frame
        add(label1); add(num1Field);  
        add(label2); add(num2Field);  
        add(labelResult); add(resultField);  

        // Set frame properties
        setSize(300, 200);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);  
    }  

    // Method to calculate the sum of the two numbers
    private void calculateSum() {  
        try {  
            // Parse the input values as integers
            int num1 = Integer.parseInt(num1Field.getText());  
            int num2 = Integer.parseInt(num2Field.getText());  
            int sum = num1 + num2;  

            // Set the sum in the result field
            resultField.setText(String.valueOf(sum));  
        } catch (NumberFormatException e) {  
            // Handle the case where input is not a valid integer
            resultField.setText("Invalid input");  
        }  
    }  

    public static void main(String[] args) {  
        new SumCalculator();  
    }  
}
