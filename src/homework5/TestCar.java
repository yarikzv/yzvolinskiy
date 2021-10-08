package homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/**
 * A simple program for illustrating of car trip from Odesa to Kyiv imitation.
 * Using Car class. Distance from Odesa to first destination point Kryve Ozero,
 * second destination point Zhashkiv, and final destination point - Kyiv set as constants.
 */
public class TestCar {
    //Distance constants in km
    public static final double DISTANCE_ODESA_KYIV = 474.0;
    public static final double DISTANCE_ODESA_KRYVE_OZERO = 179.0;
    public static final double DISTANCE_ODESA_ZHASHKIV = 328.0;

    public static void main(String[] args) {
        double fuelTotal = 0;   //fuel counter

        Car myCar = new Car();
        //Getting data from user console input
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);  // Using the useLocale() method for defining the "." as the divider
        System.out.print("Введите обьем бака Вашего автомобиля, (л): ");
        myCar.setTankCapacity(sc.nextDouble());
        System.out.print("Введите остаток топлива в начале поездки, (л): ");
        myCar.setFuelRemaining(sc.nextDouble());
        System.out.print("Введите расход топлива Вашего автомобиля, (л/100 км): ");
        myCar.setLitersPerHundred(sc.nextDouble());
        System.out.print("Введите стоимость топлива, (грн): ");
        String scannerNext = sc.next();
        //BigDecimal for money. replaceAll() for replacing comma to dot if entered.
        BigDecimal price = new BigDecimal(scannerNext.replaceAll(",", "."));

        System.out.println("---------------------------------");
        //Tank filling before start
        fuelCost(myCar.fillFullTank(), price);
        //First gasoline station Криве Озеро
        System.out.println("\nПервая остановка: Кривое Озеро. Заправляемся, пьем кофе...");
        myCar.fuelRemainingAfterDriving(DISTANCE_ODESA_KRYVE_OZERO);
        fuelTotal += myCar.calculateFillFullTankAfterDriving(DISTANCE_ODESA_KRYVE_OZERO);
        fuelCost(myCar.fillFullTank(), price);
        //Second gasoline station Жашків
        System.out.println("\nВторая остановка: Жашков. Заправляемся, пьем кофе...");
        myCar.fuelRemainingAfterDriving(DISTANCE_ODESA_ZHASHKIV - DISTANCE_ODESA_KRYVE_OZERO);
        fuelTotal += myCar.calculateFillFullTankAfterDriving(DISTANCE_ODESA_ZHASHKIV - DISTANCE_ODESA_KRYVE_OZERO);
        fuelCost(myCar.fillFullTank(), price);
        //End of trip Київ
        System.out.println("\nКиев! Приехали.");
        //Trip results
        System.out.println("---------------------------------");
        System.out.println("Результаты поездки:");
        myCar.fuelRemainingAfterDriving(DISTANCE_ODESA_KYIV - DISTANCE_ODESA_ZHASHKIV);
        fuelTotal += myCar.calculateFillFullTankAfterDriving(DISTANCE_ODESA_KYIV - DISTANCE_ODESA_ZHASHKIV);
        System.out.println("Топлива потрачено: " + fuelTotal + " л.");
        fuelCost(fuelTotal, price);
    }

    //A method for costs of fuel calculating. As parameter needed fuel volume and fuel price amounts
    //BigDecimal for money with scale 2 (2 symbols after dot)
    static void fuelCost(double fuelVolume, BigDecimal price) {
        BigDecimal cost = price.multiply(new BigDecimal(fuelVolume)).setScale(2, RoundingMode.CEILING);
        System.out.println("Стоимость: " + cost + " грн.");
    }
}
