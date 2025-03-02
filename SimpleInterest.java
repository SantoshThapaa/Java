import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SimpleInterest extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public SimpleInterest() {
        // Labels
        l1 = new JLabel("Principal:");
        l1.setBounds(10, 20, 100, 20);

        l2 = new JLabel("Rate:");
        l2.setBounds(10, 60, 100, 20);

        l3 = new JLabel("Time:");
        l3.setBounds(10, 100, 100, 20);

        l4 = new JLabel("Result:");
        l4.setBounds(10, 140, 100, 20);

        // Text Fields
        t1 = new JTextField(10);
        t1.setBounds(120, 20, 150, 20);

        t2 = new JTextField(10);
        t2.setBounds(120, 60, 150, 20);

        t3 = new JTextField(10);
        t3.setBounds(120, 100, 150, 20);

        t4 = new JTextField(10);
        t4.setBounds(120, 140, 150, 20);
        t4.setEditable(false); // Result field is read-only

        // Button
        b1 = new JButton("Calculate");
        b1.setBounds(120, 180, 100, 30);
        b1.addActionListener(this);

        // Add components to frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);

        // Frame settings
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            
            try {
                int principal = Integer.parseInt(t1.getText());
                int rate = Integer.parseInt(t2.getText());
                int time = Integer.parseInt(t3.getText());
                int simpleInterest = (principal * rate * time) / 100;
                t4.setText(String.valueOf(simpleInterest));
            } catch (NumberFormatException ex) {
                t4.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}
