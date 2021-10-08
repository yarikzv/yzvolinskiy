package homework4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A simple program for calculating the least elements of the array and displaying all of them.
 * Array length getting from user input from the console.
 * Array items calculating by Math.random() method from -10 to 10 excluding edges (for example).
 * A program contains three options for calculating. Each of the options needs calculating array elements,
 * because Arrays.sort() method make sorting through all program.*/
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = sc.nextInt();
        System.out.println("✧");
        minimum1(n);                //Option 1
        System.out.println("\n✧");
        minimum2(n);                //Option 2
        System.out.println("\n✧");
        minimum3(n);                //Option 3
    }

    //Option 1. Sort with "bubble sorting" then display the least elements of the array
    static void minimum1(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        System.out.println(Arrays.toString(array)); //displaying an original array
        for (int i = 0; i < array.length; i++) {
            int temp;
            int j = 0;
            while (j < array.length - 1) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(array)); //displaying a sorted array
        int i = 0;
        System.out.print("minimum = ");
        while (array[i] == array[0]) {
            System.out.print(" " + array[i]);       //displaying minimum while exist
            i++;
        }
    }

    //Option 2. Sort with native Array.sort() sorting then display the least elements of the array
    static void minimum2(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        System.out.println(Arrays.toString(array)); //displaying an original array
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //displaying a sorted array
        int i = 0;
        System.out.print("minimum =");
        while (array[i] == array[0]) {
            System.out.print(" " + array[i]);       //displaying minimum while exist
            i++;
        }
    }

    //Option 3. Without sorting, just definition the least and displaying the same elements.
    static void minimum3(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        System.out.println(Arrays.toString(array));
        int min = 0;
            for (int i : array) {
                if (i <= min) {
                    min = i;
                }
            }
        System.out.print("minimum = ");
        for (int i : array) {
            if (i == min) {
                System.out.print(" " + min);
            }
        }
    }
}
