package homeWork13.Task2;

import java.util.*;

/**
 * A simple program with methods for filling collection with boxes and
 * sorting to different collections if weight of boxes is over 300 grams.
 *
 * @author Yaroslav Zvolinskiy
 * @version 0.0.1
 */
public class WeightSorting {
    public static void main(String[] args) {
        List<Box> listOfBoxes = new ArrayList<>();
        List<Box> overweightList = new ArrayList<>();

        addBox(listOfBoxes);
        System.out.println("All Boxes\n" + "~".repeat(50));
        print(listOfBoxes);
        boxSorting(listOfBoxes, overweightList);
        System.out.println("\nUnderweight Boxes\n" + "~".repeat(50));
        print(listOfBoxes);
        System.out.println("\nOverweight Boxes\n" + "~".repeat(50));
        print(overweightList);
    }

    /**
     * The method for adding box to collection.
     * Generates 10 boxes with random parameters by Math.random().
     *
     * @param list Collection for adding
     */
    private static void addBox(List<Box> list) {
        for (int i = 0; i < 10; i++) {
            list.add(new Box(
                    (int) (Math.random() * 1000),
                    (int) (Math.random() * 1000),
                    (int) (Math.random() * 1000),
                    (int) (Math.random() * 1000)
            ));
        }
    }

    /**
     * The method for sorting boxes. If weight is over 300 grams add to another list.
     *
     * @param list Incoming list
     * @param overweightList Outgoing list with overweight boxes.
     */
    private static void boxSorting(List<Box> list, List<Box> overweightList) {
        for (int i = 0; i < list.size(); i++) {
            int weight = list.get(i).getWeight();
            if (weight > 300) {
                overweightList.add(list.get(i));
                list.remove(i);
                i--;
            }
        }
    }

    /**
     * The method for more comfortable displaying of list.
     *
     * @param list List for displaying.
     */
    private static void print(List<Box> list) {
        for (Box element : list) {
            System.out.println(element);
        }
    }
}
