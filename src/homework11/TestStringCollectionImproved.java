package homework11;

/**
 * This class testes improved version
 * of StringCollection - StringCollectionImproved.
 *
 * Contain tests for null elements.
 * Contain tests of performance both of classes:
 * StringCollection and StringCollectionImproved.
 *
 * @author Yaroslav Zvolinskiy, Yuriy Derevyanko.
 * @version 0.0.1
 */

public class TestStringCollectionImproved {
    public static void main(String[] args) {
        checkOperations();
        performance();
        checkNullSafeOperations();
    }

    private static void checkOperations() {
        // Check create collection
        StringCollectionImplImproved c = new StringCollectionImplImproved();
        assert (c.size() == 0);

        // Check add elements
        assert (c.add("one"));
        assert (c.add("two"));
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("two"));
        System.out.println(c);


        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("three"));

        /*
          Chek indexOf() added
         */
        // Check indexOf
        assert (c.indexOf("one") == 0);


        // Check delete element by value
        assert (c.delete("two"));
        assert (!c.delete("two"));
        assert (c.size() == 1);


        // Check add element by index
        assert (c.add("four"));
        assert (!c.add(10, "five"));
        assert (c.add(1, "five"));
        assert (c.add(0, "zero"));  // checking for more large array
        assert (c.add(2, "two"));   // checking for more large array
        assert (c.get(0).equals("zero"));    // checking for more large array
        assert (c.get(1).equals("one"));     // checking for more large array
        assert (c.get(2).equals("two"));     // checking for more large array
        assert (c.delete("one"));
        assert (c.delete(1));

        // Check equals
        StringCollectionImplImproved c1 = new StringCollectionImplImproved();
        assert (c1.add("zero"));
        assert (c1.add("one"));
        assert (c1.add("five"));
        assert (c1.equals(c));
        assert (c1.add("ten"));
        assert (!c1.equals(c));


        // Check clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);

        /*
          Checking for operations with null added
         */

        // Check add null
        assert (c.add("one"));
        assert (c.add("two"));
        assert (c.add(null));
        assert (c.size() == 3);
        assert (c.add(null));
        assert (c.add("three"));
        assert (c.add(null));
        assert (c.contains(null));

        // Check delete null
        assert (c.delete(null));
        assert (c.delete(2));   //deleting by index
        assert (c.delete(null));
        assert (c.delete("two"));
        assert (c.delete("three"));
        assert (!c.delete(null));
        assert (!c.delete("two"));
        assert (c.size() == 1);

        // Check add null by index
        assert (c.add(1, null));
        assert (c.get(0).equals("one"));
        assert (c.get(1) == null);

        // Check equals null
        assert (c1.clear());
        assert (c1.add("one"));
        assert (c1.add(null));
        assert (c1.equals(c));
        assert (c1.add("ten"));
        assert (!c1.equals(c));

        // Check null clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);
    }

    /**
     * Testing performance
     */
    private static void performance() {
        double start, end;
        StringCollectionImplImproved cImp = new StringCollectionImplImproved();
        StringCollectionImpl c = new StringCollectionImpl();

        // Adding to collection StringCollectionImplImproved
        start = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            cImp.add(String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("Improved add - " + (end - start));

        // Adding to collection StringCollectionImpl
        start = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            c.add(String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("add - " + (end - start));

        System.out.println("-----------------------");

        // Getting from collection StringCollectionImplImproved
        start = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            cImp.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Improved get - " + (end - start));

        // Getting from collection StringCollectionImpl
        start = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            c.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("get - " + (end - start));

        System.out.println("-----------------------");

        // Adding by index to collection StringCollectionImplImproved
        start = System.currentTimeMillis();
        for (int i = 0; i < 15_000; i++) {
            cImp.add(i+15,String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("Improved add by index - " + (end - start));

        // Adding by index to collection StringCollectionImpl
        start = System.currentTimeMillis();
        for (int i = 0; i < 15_000; i++) {
            c.add(i+15,String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("add by index - " + (end - start));

        System.out.println("-----------------------");

        // Deleting from collection StringCollectionImplImproved
        start = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            cImp.delete(String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("Improved delete - " + (end - start));

        // Deleting from collection StringCollectionImpl
        start = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            c.delete(String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("delete - " + (end - start));

        System.out.println("-----------------------");

        for (int i = 0; i < 20_000; i++) {
            cImp.add(String.valueOf(i));
        }

        // Deleting by index from collection StringCollectionImplImproved
        start = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            cImp.delete(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Improved delete by index- " + (end - start));
    }

    private static void checkNullSafeOperations() {
        // Check create collection
        StringCollectionImplImproved c = new StringCollectionImplImproved();
        assert (c.size() == 0);

        // Check add elements
        assert(c.add("one"));
        assert(c.add("two"));
        assert (c.size() == 2);
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("two"));

        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("three"));

        // Check contains null element
        assert(c.add(null));
        assert (c.size() == 3);
        assert (c.contains(null));

        // Check delete element by value
        assert (c.delete(null));
        assert (c.delete("two"));
        assert (!c.delete(null));
        assert (!c.delete("two"));
        assert (c.size() == 1);


        // Check add element by index
        assert(c.add("four"));
        assert (!c.add(10, "five"));
        assert (c.add(1, "five"));
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("five"));
        assert (c.get(2).equals("four"));
        assert (c.delete("four"));

        // Check equals
        StringCollectionImplImproved c1 = new StringCollectionImplImproved();
        assert(c1.add("one"));
        assert(c1.add("five"));
        assert (c1.equals(c));
        assert (c1.add("ten"));
        assert (!c1.equals(c));


        // Check clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);
    }
}
