package homeWork5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/**
 * A simple program for illustrating of car trip from Odesa to Kyiv imitation.
 * My interpretation of task.
 * Using Car class. Distance from Odesa to first destination point Kryve Ozero,
 * second destination point Zhashkiv, and final destination point - Kyiv set as constants.
 * Then created an array for dividing all trips into segments.
 * In stop points used isFuelRemainingEnough method for the definition that fuel filling is needed.
 */
public class TestCar_v2 {

    public static final double DISTANCE_ODESA_KYIV = 474.0;
    public static final double DISTANCE_ODESA_KRYVE_OZERO = 179.0;
    public static final double DISTANCE_ODESA_ZHASHKIV = 328.0;
    public static final String COLOR_RED_ITALIC = "\033[31;3m";
    public static final String COLOR_BLUE_ITALIC = "\033[34;3m";
    public static final String COLOR_CLEAR = "\033[0m";

    public static void main(String[] args) throws InterruptedException {
        double fuelTotal = 0;   //fuel counter
        //Getting data from user console input
        Car customersCar = new Car();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);  // Using the useLocale() method for defining the "." as the divider;
        System.out.print("Введите обьем бака Вашего автомобиля: ");
        customersCar.setTankCapacity(sc.nextDouble());
        System.out.print("Введите остаток топлива в начале поездки: ");
        customersCar.setFuelRemaining(sc.nextDouble());
        System.out.print("Введите расход топлива л/100 км Вашего автомобиля: ");
        customersCar.setLitersPerHundred(sc.nextDouble());
        System.out.print("Введите стоимость топлива: ");
        String scannerNext = sc.next();
        //BigDecimal for money. replaceAll() for replacing comma to dot if entered.
        BigDecimal price = new BigDecimal(scannerNext.replaceAll(",", "."));
        //creating an array of distances from point to point like trip segments
        double[] distances = new double[]{
                DISTANCE_ODESA_KRYVE_OZERO,
                DISTANCE_ODESA_ZHASHKIV - DISTANCE_ODESA_KRYVE_OZERO,
                DISTANCE_ODESA_KYIV - DISTANCE_ODESA_ZHASHKIV
        };
        System.out.println("---------------------------------");
        System.out.println("Начинаем поездку. Счастливого пути!");
        System.out.println("Топлива в баке: "
                + customersCar.getFuelRemaining()
                + " л. ");
        //calculation of trip segments by for statement
        for (int i = 0; i < distances.length; i++) {
            if (isFuelRemainingEnough(
                    customersCar.getFuelRemaining(),
                    customersCar.getLitersPerHundred(),
                    distances[i])) {
                if (i == 0) {
                    System.out.println(COLOR_BLUE_ITALIC
                            + "Этого достаточно для начала поездки. Поехали!"
                            + COLOR_CLEAR
                    );
                } else {
                    System.out.println(COLOR_BLUE_ITALIC
                            + "Этого достаточно для продолжения поездки. Поехали!"
                            + COLOR_CLEAR
                    );
                }
            } else {
                System.out.println(COLOR_RED_ITALIC +
                        "Необходимо заправиться. "
                        + COLOR_CLEAR
                );
                fuelCost(customersCar.fillFullTank(), price);
            }
            waiting();  //waiting animation
            //stop points definition
            switch (i) {
                case 0:
                    System.out.println("⛽ Первая остановка: Кривое Озеро. Пьем кофе ☕");
                    break;
                case 1:
                    System.out.println("⛽ Вторая остановка: Жашков. Пьем кофе ☕");
                    break;
                case 2:
                    System.out.println("\uD83C\uDFD9️ Киев! Приехали. \uD83C\uDFD9️");
                    break;
            }
            customersCar.fuelRemainingAfterDriving(distances[i]);
            fuelTotal += customersCar.calculateFillFullTankAfterDriving(distances[i]);
        }

        //displaying results of trip
        System.out.println("---------------------------------");
        System.out.println("Результаты поездки:");
        System.out.println("Остаток топлива в баке: " + customersCar.getFuelRemaining() + " л.");
        System.out.println("Топлива потрачено: " + Math.round(fuelTotal * 100.0) / 100.0 + " л.");
        fuelCost(fuelTotal, price);
    }

    //A method for costs of fuel calculating. As parameter needed fuel volume and fuel price amounts
    //BigDecimal for money with scale 2 (2 symbols after dot)
    static void fuelCost(double fuelVolume, BigDecimal price) {
        BigDecimal cost = price.multiply(new BigDecimal(fuelVolume)).setScale(2, RoundingMode.CEILING);
        System.out.println("Стоимость: " + cost + " грн.");
    }

    //Return true if there is enough fuel to travel to the next stop
    static boolean isFuelRemainingEnough(double fuelRemaining, double literPerHundred, double distanceToNextStop) {
        return fuelRemaining / literPerHundred > distanceToNextStop / 100.0;
    }
    //animation of waiting
    static void waiting() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.print("\r⏳");
            Thread.sleep(400);
            System.out.print("\r⌛");
            Thread.sleep(400);
        }
        System.out.println();
    }
}
