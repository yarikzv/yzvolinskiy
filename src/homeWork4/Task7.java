package homeWork4;

import java.util.Scanner;

/**
 * A simple program for displaying table of multiplying for user entered numbers.
 * The result displayed in table and painted in different colors for more comfortable look.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число Х: ");
        int x = sc.nextInt();
        table(x);
    }

    static void table(int x) {
        System.out.println("\033[31;3mТАБЛИЦА УМНОЖЕНИЯ ДЛЯ ЧИСЛА " + x + "\033[0m");
        System.out.println("┌──────┬───┬────┬───┬───────┐");            //displaying top of table
        for (int i = 1; i <= 10; i++) {
            //using printf for formatting data in a table
            System.out.printf("│ %4d │ \033[33;2m*\033[0m │ %2d │ \033[33;2m=\033[0m │ \033[36;3m%5d\033[0m │", x, i, x * i);
            if (i != 10) {
                System.out.print("\n├──────┼───┼────┼───┼───────┤\n");  //displaying middle divider of table
            }

        }
        System.out.println("\n└──────┴───┴────┴───┴───────┘");          //displaying bottom of table
    }
}
