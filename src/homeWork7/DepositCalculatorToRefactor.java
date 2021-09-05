package homeWork7;

import java.util.Scanner;

/**
 * An example of program refactoring.
 * println changed to printf. For double numbers used format %.2
 * for two digits after dot displaying. Using yearFix() method
 * for changing "год" to "год/года/лет".*/
public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        double sum = sc.nextDouble();
        System.out.print("Какой процент годовых? ");
        double percent = sc.nextDouble();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            System.out.printf("Накопленная сумма за %d %s составила: %.2f грн\n", i, yearFix(i), sum);
            System.out.printf("Начисленные проценты в грн: %.2f\n", y);
            System.out.println("-------");
        }
    }
    /*This method checks year and returns right word "год", "года" or "лет" for current year*/
    static String yearFix(int year) {
        if (!(year % 100 >= 11 && year % 100 <= 14)) {      //if not 11, 12, 13 or 14 - go to switch statement
            switch (year % 10) {
                case 1:
                    return "год";
                case 2:
                case 3:
                case 4:
                    return "года";
                default:
                    return "лет";
            }
        } else {                                            //else return "лет"
            return "лет";
        }
    }
}
