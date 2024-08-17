package Emp;
import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
    }
}
