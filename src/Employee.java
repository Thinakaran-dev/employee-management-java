/**
 * Employee model class
 */
public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + salary);
    }
}
