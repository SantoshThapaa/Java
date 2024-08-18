package Lab2.Controls;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExamples {
    //frame
    JFrame f;
    //Table
    JTable j;

    //COnstructor
    JTableExamples(){
        //Frame installation
        f= new JFrame();

        //Frame Title
        f.setTitle("JTable Example");

        //Data to be displayed in the JTable
        String[][] data= {
            {"Santosh Thapa", "4031","CSE"},
            {"Anand Jha", "6041", "IT"}
        };

        //Columns Names
        String[] columnNames ={"Name", "Roll Number", "Department"};

        //Initializing the JTables
        j =new JTable(data,columnNames);
        j.setBounds(30, 40, 200, 300);

        //adding it to the JScrollPane
        JScrollPane sp= new JScrollPane(j);
        f.add(sp);
        //Frame Size
        f.setSize(500,200);
        //Frame Visible = true
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableExamples();
    }
    
}
