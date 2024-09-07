package Lab3;

import java.awt.*;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent extends Frame implements ActionListener {
    TextField tf;

    AEvent() {
        //create components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);

        Button b = new Button("Click Me");
        b.setBounds(100,120,80,30);

        //register listener
        b.addActionListener(this); //passing current instance

        //add components and set size, layout, and visibility
        add(b);
        add(tf);

        setSize(300,300);
        setLayout(null);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String args[]) {
        AEvent event =new AEvent();
    }
    
}
