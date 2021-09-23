package lesson10;

public class Department {
    private int id;
    private String department;

    public Department(int id, String department) {
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department=" + department +
                '}';
    }
}
