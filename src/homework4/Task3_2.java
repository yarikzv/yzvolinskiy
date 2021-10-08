package homework4;

import java.util.Scanner;
/**
 * The simplest program for calculating n-factorial.
 * The 'n' number is getting from console input by user.
 * Using 'while' statement for result calculating.
 */
public class Task3_2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите целое число n: ");
        System.out.println("n! = " + factorial(n.nextInt()));
    }

    static int factorial(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
}
