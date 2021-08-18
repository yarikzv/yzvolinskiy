package homeWork2;

import java.util.Locale;
import java.util.Scanner;

/**
 * A simple program for calculating the average amount of two numbers.
 * Numbers are getting from console input using Scanner class.
 * Using the useLocale() method for defining the "." (dot) as the divider.
 * The result is rounded for three numbers after the dot.
 */
public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double result;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  // Using the useLocale() method for defining the "." as the divider
        System.out.println("\033[34;3m* Используйте точку для разделения дробной части *\033[0m");
        //Getting a first number
        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextDouble();
        //Getting a second number
        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextDouble();
        //Result calculating
        result = (firstNumber + secondNumber) / 2.0;
        //Result displaying
        System.out.println("\nСреднее арифметическое значение двух чисел \n"
                + firstNumber + " и " + secondNumber
                + " составляет: \n"
                + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n"
                + Math.round(result * 1000.0) / 1000.0
                + " \033[35;3m(В случае большой дробной части округляем до трех знаков после запятой)\033[0m");
    }
}
