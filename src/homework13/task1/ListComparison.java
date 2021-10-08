package homework13.task1;

import java.util.*;

/**
 * A simple program for comparison ArrayList and LinkedList add and get operations.
 */
public class ListComparison {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        addMethod(arrayList);

        addMethod(linkedList);

        getMethodUsingShuffle(arrayList);

        getMethodUsingMathRandom(linkedList);

        //getMethod(linkedList);          //takes about 4 minutes on my PC
    }

    /**
     * Allows adding to any List Integer numbers from 0 to 1_000_000 and calculates
     * elapsed time.
     *
     * @param list List for adding elements.
     */
    public static void addMethod(List<Integer> list) {
        double start, end;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        end = System.currentTimeMillis();
        System.out.printf("Add to %s time: %s ms\n", list.getClass().getSimpleName(), (end - start));
    }

    /**
     * Allows to get any 100_000 elements by Math.random() method and calculates
     * elapsed time. Repeating of indexes is allowed.
     *
     * @param list List of items for getting.
     */
    public static void getMethodUsingMathRandom(List<Integer> list) {
        double start, end;
        start = System.currentTimeMillis();
        List<Integer> copy = new ArrayList<>(list);
        for (int i = 0; i < 100_000; i++) {
            copy.add((int) (Math.random() * 1_000_000));
        }
        for (int i = 0; i < 100_000; i++) {
            list.get(copy.get(i));
        }
        end = System.currentTimeMillis();
        System.out.printf("Get from %s time: %s ms\n", list.getClass().getSimpleName(), (end - start));
    }

    /**
     * Allows to get any 100_000 elements by creating a copy of list and
     * shuffling items and calculates elapsed time. Then getting items by indexes
     * from shuffled list. It allows avoiding repeating indexes.
     * But take more time... A lot of time. 10 times more than getMethodUsingMathRandom().
     *
     * @param list List of items for getting.
     */
    public static void getMethodUsingShuffle(List<Integer> list) {
        double start, end;
        start = System.currentTimeMillis();
        List<Integer> copy = new ArrayList<>(list);
        Collections.shuffle(copy);
        for (int i = 0; i < 100_000; i++) {
            list.get(copy.get(i));
        }
        end = System.currentTimeMillis();
        System.out.printf("Get from %s time: %s ms\n", list.getClass().getSimpleName(), (end - start));
    }
}

