package homework7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * An example of program refactoring.
 * println changed to printf. For double numbers used format %.2
 * for two digits after dot displaying. Using yearFix() method
 * for changing "год" to "год/года/лет". Also, using BigDecimal
 * with Scale 2 and RoundingMode.CEILING to store money amount.*/
public class DepositCalculatorToRefactor_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        BigDecimal sum = sc.nextBigDecimal();
        System.out.print("Какой процент годовых? ");
        BigDecimal percent = sc.nextBigDecimal();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            BigDecimal y = sum
                    .divide(BigDecimal.valueOf(100), RoundingMode.CEILING)
                    .multiply(percent)
                    .setScale(2, RoundingMode.CEILING);
            sum = sum.add(y).setScale(2, RoundingMode.CEILING);
            System.out.printf("Накопленная сумма за %d %s составила: %.2f грн\n", i, yearFix(i), sum);
            System.out.println("Начисленные проценты в грн: " + y);
            System.out.println("-------");
        }
    }
    /*This method checks year and returns right word "год", "года" or "лет" for current year.
    * Using if else statement.*/
    static String yearFix(int year) {
        if (year % 100 >= 11 && year % 100 <= 14) {
            return "лет";
        } else if (year % 10 == 1) {
            return "год";
        } else if (year % 10 > 1 && year % 10 < 5) {
            return "года";
        } else {
            return "лет";
        }
    }
}
