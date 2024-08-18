package Lab2.Layout;
import javax.swing.*;
import java.awt.*;
//import java.awt.FlowLayout;

public class FlowLayoutDemo {
    public static void main(String[] args){
        JFrame frame=new JFrame("Flow Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);

        JPanel panel= new JPanel();
        panel.setLayout(new FlowLayout());//Flowlayout 

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
