package homeWork4;

/**
 * The simplest program for displaying odd numbers from 1 to 100.
 * Using 'do..while' statement.
 */
public class Task4_1 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 100);
    }
}
