package lesson10;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InnerJoinDemo {

    public static void main(String[] args) throws IOException {
        List<Employee> employees = readEmployee("C:\\temp\\employees.csv");
        List<Department> department = readDepartment("C:\\temp\\departments.csv");
    }

    public static Employee convertToEmployee(String str) {
        String[] arr = str.split(";");
        return new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]));

    }

    public static Department convertToDepartment(String str) {
        String[] arr = str.split(";");
        return new Department(Integer.parseInt(arr[0]), arr[1]);

    }
    static List<Employee> readEmployee(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<Employee> result = new ArrayList<>();
        Scanner sc = new Scanner(path);
        sc.next();
        while (sc.hasNext()) {
            String str = sc.next();
            result.add(convertToEmployee(str));
        }
        System.out.println(result);
        return result;
    }

    private static List<Department> readDepartment(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<Department> result = new ArrayList<>();
        Scanner sc = new Scanner(path);
        sc.next();
        while (sc.hasNext()) {
            String str = sc.next();
            result.add(convertToDepartment(str));
        }
        System.out.println(result);
        return result;
    }
}
