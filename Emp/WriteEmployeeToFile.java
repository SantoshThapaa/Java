package Emp;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployeeToFile {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "HR");
        Employee emp2 = new Employee("Jane Smith", 102, "IT");

        try (FileOutputStream fos = new FileOutputStream("emp.doc");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp1);
            oos.writeObject(emp2);

            System.out.println("Employee objects have been serialized to emp.doc");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
