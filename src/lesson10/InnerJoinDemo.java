package lesson10;

public class InnerJoinDemo {

    public static Employee convertToEmployee(String str) {
        String[] arr = str.split(";");
        return new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]));



    }
}
