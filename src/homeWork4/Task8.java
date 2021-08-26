package homeWork4;

import java.util.Arrays;

/**
 * A simple program for displaying top 10 odd numbers.
 * First option displaying result by dividing by Comma ','.
 * Second option use Arrays.toString() method.
 */
public class Task8 {
    public static void main(String[] args) {
        arrayOfOdd1();
        arrayOfOdd2();
    }
    //Option 1
    static void arrayOfOdd1() {
        int[] array = new int[10];
        int element = -1;
        for (int i = 0; i < array.length; i++) {
            element += 2;
            array[i] = element;
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
    }
    //Option 2
    static void arrayOfOdd2() {
        int[] array = new int[10];
        int element = -1;
        for (int i = 0; i < array.length; i++) {
            element += 2;
            array[i] = element;
        }
        System.out.println(Arrays.toString(array));
    }
}
