package homeWork3;

import java.util.Scanner;

/**
 * The simplest program for calculating n-factorial.
 * The 'n' number is getting from console input by user.
 * Using 'for' statement for result calculating.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите целое число n: ");
        System.out.println("n! = " + factorial(n.nextInt()));
    }
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
