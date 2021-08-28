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
        double result = 1.0;
        int step = n > 0 ? n : (-1) * n;    //using ternary operator for getting absolute meaning of 'n'
        for (int i = 0; i < step; i++) {
            result *= x;
        }
        if (n < 0) {
            result = 1.0 / result;
        }
        System.out.println("x^n = " + result);

        //Using Math
        System.out.println("x^n = " + Math.pow(x, n));
    }
}
