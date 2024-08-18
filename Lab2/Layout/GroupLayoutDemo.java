package Lab2.Layout;
import javax.swing.*;

public class GroupLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel label = new JLabel("Label:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Button");

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(label)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(textField)
                    .addComponent(button))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(textField))
                .addComponent(button)
        );

        frame.add(panel);
        frame.setVisible(true);
    }
}
