package homeWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * A simple program for calculating the average amount of arbitrary quantity of numbers.
 * Numbers are getting from console input using Scanner class.
 * The numbers are collected to ArrayList because the quantity of numbers is not known in advance.
 * Using the useLocale() method for defining the "." (dot) as the divider.
 * The result is rounded for three numbers after the dot.
 *
 * P.S. This task has many options for implementation. I think it should be like this one.
 */
public class AverageOfArbitraryQuantityNumbers {
    public static void main(String[] args) {
        List<Double> arrayList= new ArrayList<>();
        double result = 0;
        String continueYesNo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  // Using the useLocale() method for defining the "." as the divider
        System.out.println("\033[34;3m* Используйте точку для разделения дробной части *\033[0m");
        do {
            //Getting the number
            System.out.print("Введите число: ");
            //Adding numbers to arrayList
            arrayList.add(scanner.nextDouble());
            //Checking for continue
            System.out.print("Продолжить? Введите \033[34;3m\"y\"\033[0m  ");
            continueYesNo = scanner.next();
        } while (continueYesNo.equals("y"));
        //Result calculating
        for (Double item : arrayList){
            result = result + item;
        }
        result =  result/(double) arrayList.size();
        //Result displaying
        System.out.println("\nСреднее арифметическое значение "+ arrayList.size() + " чисел \n"
                + arrayList
                + "\nсоставляет: \n"
                + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n"
                + Math.round(result * 1000.0) / 1000.0
                + " \033[35;3m(В случае большой дробной части округляем до трех знаков после запятой)\033[0m");
    }
}
