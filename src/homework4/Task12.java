package homework4;

import java.util.Arrays;

/**
 * A simple program for calculating average amount of array's elements.
 * An array fills by Math.random method from 0 to 9.
 * All numbers are summed up and divided by array's length.
 */
public class Task12 {
    public static void main(String[] args) {
        average();
    }

    static void average() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double avg = (double) sum / (double) array.length;
        System.out.println("Среднее значение элементов массива = " + avg);
    }
}
