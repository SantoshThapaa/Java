package Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ItemListenerExample extends JFrame implements ItemListener {
    Checkbox cb1, cb2;
    Label label;
    ItemListenerExample() {
        Frame f = new Frame("CheckBox Example");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);

        cb1 = new Checkbox("C++");
        cb1.setBounds(100,100,50,50);

        cb2 = new Checkbox("Java");
        cb2.setBounds(100,150,50,50);

        f.add(cb1);
        f.add(cb2);
        f.add(label);

        cb1.addItemListener(this);
        cb2.addItemListener(this);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==cb1){
            label.setText("C++ checked" + (e.getStateChange()==1?"Checked":"Unchecked"));
        }

        if(e.getSource()==cb2){
            label.setText("Java checked " + (e.getStateChange()==1?"Checked":"Unchecked"));
        }
    }

    public static void main(String args[]){
        new ItemListenerExample();
    }
    
}
