package homeWork3;

import java.util.Scanner;

/**
 * The simplest program for calculating n-factorial.
 * The 'n' number is getting from console input by user.
 * Using 'do..while' statement for result calculating.
 */
public class Task4_2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите целое число n: ");
        System.out.println("n! = " + factorial(n.nextInt()));
    }

    static int factorial(int n) {
        int result = 1;
        int i = 1;
        do {
            result *= i;
            i++;
        } while (i <= n);
        return result;
    }
}
