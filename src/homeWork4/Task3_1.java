package homeWork4;

/**
 * The simplest program for displaying odd numbers from 1 to 100.
 * Using 'while' statement.
 */
public class Task3_1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
