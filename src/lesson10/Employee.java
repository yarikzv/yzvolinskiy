package lesson10;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int departmentId;

    public Employee(int id, String name, String surname, int departmentId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
