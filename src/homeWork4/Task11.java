package homeWork4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A simple program that replace the biggest and the least elements of array.
 * First option use 'for' and 'if' statements for defining the biggest and the least elements and their indexes.
 * And then replace elements.
 * Second option use ArrayList and Collections.max() and arrayList.indexOf() methods for replacing elements.
 */
public class Task11 {
    public static void main(String[] args) {
        replaceMinMax1();
        replaceMinMax2();
    }
    //Option 1
    static void replaceMinMax1(){
        int[] array = {4, -5, 0, 6, 8};
        int min=0, max=0;
        int minPosition = 0, maxPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                minPosition =i;
            } else if (array[i] >= max) {
                max = array[i];
                maxPosition = i;
            }
        }
        int temp=array[minPosition];
        array[minPosition] = array[maxPosition];
        array[maxPosition] = temp;
        System.out.println(Arrays.toString(array));
    }
    //Option 2
    static void replaceMinMax2(){
        int[] array = {4, -5, 0, 6, 8};
        List<Integer> arrayList = new ArrayList<>(array.length);
        for (int i: array){
            arrayList.add(i);
        }
        int maxElement = Collections.max(arrayList);
        int minElement = Collections.min(arrayList);
        int max = arrayList.indexOf(maxElement);
        int min = arrayList.indexOf(minElement);
        arrayList.set(max, minElement);
        arrayList.set(min, maxElement);
        System.out.println(arrayList);

    }
}
