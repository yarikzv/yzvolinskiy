package homeWork4;

/**
 * The simplest program that display 10 first sequence numbers 0, -5, -10, -15 ..
 * Using three different options.
 * */

public class Task6 {
    public static void main(String[] args) {
        //Option 1
        for (int i = 0; i > -50; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n──────────────────────────────────────");
        //Option 2
        int[] arr = new int[10];
        int n = 5;
        for (int i = 0; i < arr.length; i++) {
            n -= 5;
            System.out.print(arr[i] = n);
            System.out.print(" ");
        }
        System.out.println("\n──────────────────────────────────────");
        //Option 3
        int i = 0;
        int first = 0;
        while (i < 10) {
            System.out.print(first + " ");
            first -= 5;
            i++;
        }

    }
}
