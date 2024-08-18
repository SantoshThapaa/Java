package Lab2.Controls;
import javax.swing.*;

public class JTextDemo {
    public static void main(String[] args){
        JFrame frame =new JFrame("JText Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setSize(300, 400);

        JTextField textField= new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JTextArea textArea = new JTextArea(10, 20);

        panel.add(new JLabel("Text Field:"));
        panel.add(textField);
        panel.add(new JLabel("Password Field:"));
        panel.add(passwordField);
        panel.add(new JLabel("Text Area:"));
        panel.add(new JScrollPane(textArea)); // Adding JTextArea to JScrollPane

        frame.add(panel);
        frame.setVisible(true);
    }
    
}
