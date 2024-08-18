package Lab2.Controls;
import javax.swing.*;

public class ScrollPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ScrollPane Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
