package homeWork4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A simple program for calculating the biggest elements of the array and displaying all of them.
 * Array length getting from user input from the console.
 * Array items calculating by Math.random() method from -10 to 10 excluding edges (for example).
 * A program contains three options for calculating. Each of the options needs calculating array elements,
 * because Arrays.sort() method make sorting through all program.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = sc.nextInt();
        System.out.println("✧");
        maximum1(n);                //Option 1
        System.out.println("\n✧");
        maximum2(n);                //Option 2
        System.out.println("\n✧");
        maximum3(n);                //Option 3
    }

    //A method for creating an array and filling it using Math.random() method
    static int[] arrayCreator(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        return array;
    }
    //Option 1. Sort with "bubble sorting" then display the biggest elements of the array
    static void maximum1(int n) {
        int[] array = arrayCreator(n);
        System.out.println(Arrays.toString(array)); //displaying an original array

        for (int i = 0; i < array.length; i++) {
            int temp;
            int j = 0;
            while (j < array.length - 1) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(array)); //displaying a sorted array
        int i = 0;
        System.out.print("maximum:");
        while (array[i] == array[0]) {
            System.out.print(" " + array[i]);       //displaying maximum while exist
            i++;
        }
    }

    //Option 2. Sort with native Array.sort() sorting then display the biggest elements of the array
    static void maximum2(int n) {
        int[] array = arrayCreator(n);
        System.out.println(Arrays.toString(array)); //displaying an original array
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //displaying a sorted array
        int i = array.length - 1;
        System.out.print("maximum:");
        while (array[i] == array[array.length - 1]) {
            System.out.print(" " + array[i]);       //displaying maximum while exist
            i--;
        }
    }

    //Option 3. Without sorting, just definition the biggest and displaying the same elements.
    static void maximum3(int n) {
        int[] array = arrayCreator(n);
        System.out.println(Arrays.toString(array)); //displaying an array
        int max = 0;
        for (int i : array) {
            if (i >= max) {
                max = i;
            }
        }
        System.out.print("maximum: ");
        for (int i : array) {
            if (i == max) {
                System.out.print(" " + max);
            }
        }
    }
}
