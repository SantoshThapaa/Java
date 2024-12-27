import java.awt.*;
import java.awt.event.*;

class AEventExample extends Frame implements ActionListener {
    TextField tf;

    AEventExample() {
        // Create TextField and set its position
        tf = new TextField();
        tf.setBounds(50, 50, 200, 30);

        // Create Button and set its position
        Button b1 = new Button("Click");
        b1.setBounds(50, 100, 100, 30);

        // Add components to the frame
        add(tf);
        add(b1);

        // Add ActionListener to the button
        b1.addActionListener(this);

        // Frame properties
        setLayout(null); // Use null layout
        setSize(400, 400); // Set frame size
        setTitle("AWT Event Example");
        setVisible(true);

        // Add window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Define the actionPerformed method
    public void actionPerformed(ActionEvent e) {
        tf.setText("Button Clicked");
    }

    // Main method to run the application
    public static void main(String args[]) {
        new AEventExample();
    }
}
