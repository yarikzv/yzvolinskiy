package homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * A simple program for calculating the yearly amount of deposit percents and deposit increasing.
 * In this program was used a BigDecimal class for storing data of money.
 * Deposits, percents, and years value got from console input using Scanner class.*/
public class DepositDetails {
    public static void main(String[] args) {
        String deposit;
        String percent;
        int years;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму депозита: ");
        deposit = sc.nextLine();
        System.out.print("Введите значения процента годовых: ");
        percent = sc.nextLine();
        System.out.print("Введите срок депозита: ");
        years = sc.nextInt();
        //Creating BigDecimal class member for deposit and percent value
        BigDecimal depositBigDecimal = new BigDecimal(deposit).setScale(4, RoundingMode.CEILING);
        BigDecimal percentBigDecimal = new BigDecimal(percent).setScale(4, RoundingMode.CEILING);

        //Displaying the result
        System.out.println("────────────────────────────────────────────");
        for (int i = 0; i < years; i++) {
            //Getting the yearly amount of percents
            BigDecimal percentAmount = depositBigDecimal
                    .divide(BigDecimal.valueOf(100), 4, RoundingMode.CEILING)
                    .multiply(percentBigDecimal)
                    .setScale(4, RoundingMode.CEILING);
            System.out.print("Накопленная сумма за " + (i+1) + "-й год: \t");
            System.out.print(depositBigDecimal = depositBigDecimal.add(percentAmount)); //Increasing deposit amount
            System.out.println(" ₴, UAH");
            System.out.print("Проценты за " + (i+1) + "-й год: \t\t\t");
            System.out.print(percentAmount);
            System.out.println(" ₴, UAH");
            System.out.println("───");
        }
    }
}
