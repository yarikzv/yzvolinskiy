package homeWork7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

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
                    .divide(BigDecimal.valueOf(100),RoundingMode.CEILING)
                    .multiply(percent)
                    .setScale(2, RoundingMode.CEILING);
            sum = sum.add(y).setScale(2, RoundingMode.CEILING);
            System.out.printf("Накопленная сумма за %d %s составила: %.2f грн\n", i, yearFix(i), sum);
            System.out.println("Начисленные проценты в грн: " + y);
            System.out.println("-------");
        }
    }

    static String yearFix(int year) {
        boolean exception = year % 100 >= 11 && year % 100 <= 14;
        if (exception){
            return "лет";
        } else if(year % 10 == 1) {
            return "год";
        } else if (year % 10 > 1 && year % 10 < 5) {
            return "года";
        } else {
            return "лет";
        }
    }
}
