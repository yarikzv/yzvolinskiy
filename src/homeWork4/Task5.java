package homeWork4;

import java.util.Scanner;

/**
 * The simplest program for calculating x^n sentence.
 * First option use 'for'. Second option use Math.pow() method.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число х: ");
        int x = scanner.nextInt();
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        //Using "for"
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println("x^n = " + result);

        //Using Math
        System.out.println("x^n = " + (int) Math.pow(x, n));
    }
}
