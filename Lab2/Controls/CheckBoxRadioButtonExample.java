package Lab2.Controls;
import javax.swing.*;

public class CheckBoxRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox & RadioButton Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JCheckBox
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        checkBox1.setBounds(50, 50, 100, 30);
        frame.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox("Option 2");
        checkBox2.setBounds(50, 100, 100, 30);
        frame.add(checkBox2);

        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Choice A");
        radioButton1.setBounds(200, 50, 100, 30);
        frame.add(radioButton1);

        JRadioButton radioButton2 = new JRadioButton("Choice B");
        radioButton2.setBounds(200, 100, 100, 30);
        frame.add(radioButton2);

        // Grouping RadioButtons
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        frame.setVisible(true);
    }
}
