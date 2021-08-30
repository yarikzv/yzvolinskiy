package lesson6;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(calculate("6 * 3"));
    }



    static double calculate(String input) {
        double result = 0;
        String[] arr = input.split(" ");
        switch (arr[1]) {
            case "+":
                result = Double.parseDouble(arr[0]) + Double.parseDouble(arr[2]);
                break;
            case "-":
                result = Double.parseDouble(arr[0]) - Double.parseDouble(arr[2]);
                break;
            case "*":
                result = Double.parseDouble(arr[0]) * Double.parseDouble(arr[2]);
                break;
            case "/":
                result = Double.parseDouble(arr[0]) / Double.parseDouble(arr[2]);
                break;
        }
        return result;
    }
}
