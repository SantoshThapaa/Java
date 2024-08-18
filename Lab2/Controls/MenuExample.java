package Lab2.Controls;
import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        // JMenu
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // JMenuItem
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Adding MenuItems to File Menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        // Adding Menus to the MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Setting the MenuBar on the Frame
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
