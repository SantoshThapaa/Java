package Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringManipulatorGUI extends JFrame implements ActionListener {
    // Components of the form
    private JTextField inputField;
    private JLabel messageLabel;
    private JButton checkPalindromeButton, reverseButton, findVowelsButton;

    public StringManipulatorGUI() {
        // Setting up the JFrame
        setTitle("String Manipulator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initializing components
        messageLabel = new JLabel("Input any string:");
        inputField = new JTextField(20);
        checkPalindromeButton = new JButton("Check Palindrome");
        reverseButton = new JButton("Reverse");
        findVowelsButton = new JButton("Find Vowels");

        // Adding components to the frame
        add(messageLabel);
        add(inputField);
        add(checkPalindromeButton);
        add(reverseButton);
        add(findVowelsButton);

        // Adding action listeners
        checkPalindromeButton.addActionListener(this);
        reverseButton.addActionListener(this);
        findVowelsButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = inputField.getText();
        if (e.getSource() == checkPalindromeButton) {
            if (isPalindrome(inputText)) {
                JOptionPane.showMessageDialog(this, "The string is a palindrome.");
            } else {
                JOptionPane.showMessageDialog(this, "The string is not a palindrome.");
            }
        } else if (e.getSource() == reverseButton) {
            String reversed = new StringBuilder(inputText).reverse().toString();
            inputField.setText(reversed);
        } else if (e.getSource() == findVowelsButton) {
            String vowels = extractVowels(inputText);
            JOptionPane.showMessageDialog(this, "Vowels in the string: " + vowels);
        }
    }

    private boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }

    private String extractVowels(String str) {
        StringBuilder vowels = new StringBuilder();
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels.append(ch);
            }
        }
        return vowels.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StringManipulatorGUI gui = new StringManipulatorGUI();
            gui.setVisible(true);
        });
    }
}
