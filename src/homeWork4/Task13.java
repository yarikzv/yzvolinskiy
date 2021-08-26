package homeWork4;
/**
 * A simple program for displaying chess table using two-dimensional array (array of arrays).
 * First option displaying symbols "W" and "B" in chess order.
 * Second option displaying chess table by painting element of array in two color: black and white.
 * Also, first row and first column of table show us letters and numbers like original chess table.*/
public class Task13 {
    public static void main(String[] args) {
        chessTable();
        chessTableGraphic();
    }
    //Option 1
    static void chessTable() {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }
        //displaying in console
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
    //Option 2
    static void chessTableGraphic() {
        System.out.println("\n        \033[31;3mCHESS TABLE\033[0m");
        String[][] array = new String[9][9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    array[i][j] = " " + (char) (64 + j) + " ";  //first row like alphabet letters from A to H
                } else if (j == 0) {
                    array[i][j] = " " + i + " ";                //first column like numbers from 1 to 8
                } else if ((i + j) % 2 == 0) {
                    array[i][j] = "\033[107m   \033[0m";        //white square
                } else {
                    array[i][j] = "\033[40m   \033[0m";         //black square
                }
            }
        }
        array[0][0] = "   ";                                    //empty square for [0][0] position
        //displaying in console
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
