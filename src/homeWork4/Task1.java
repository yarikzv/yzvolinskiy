package homeWork4;

/**
 * The simplest program for displaying odd numbers from 1 to 100.
 */
public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
