package homework12;

import homework12.interfaces.CustomCollection;

/**
 * Test class for testing collection LinkedListCollectionImpl
 */
public class TestLinkedListCollectionsImpl {
    public static void main(String[] args) {
        checkOperations();
        checkNullSafeOperations();
    }

    private static void checkOperations(){
        CustomCollection c = new LinkedListCollectionImpl();
        // Check create collection
        assert (c.size() == 0);

        // Check add elements
        assert (c.add("one"));
        assert (c.add("two"));
        assert (c.add("three"));
        System.out.println(c);
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("two"));

        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("four"));

        // Check delete element by value
        assert (c.delete("two"));
        assert (!c.delete("two"));
        assert (c.size() == 2);

        // Check delete element by index
        assert  (c.delete(1));
        assert  (!c.delete(1));
        assert  (c.size() == 1);

        // Check addAll(String[] strArr)
        String[] strArr = new String[]{"two", "three", "four"};
        assert  (c.addAll(strArr));
        assert  (c.size() == 4);

        // Check addAll(CustomCollection coll)
        CustomCollection c1 = new LinkedListCollectionImpl();
        assert (c1.add("five"));
        assert (c1.add("six"));
        assert  (c.addAll(c1));
        assert  (c.size() == 6);

        // Check get
        assert (c.get(3).equals("four"));

        // Check clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);

        // Check equals
        assert (c.add("five"));
        assert (c.add("six"));
        assert (c1.equals(c));
        assert (c1.add("ten"));
        assert (!c1.equals(c));

        // Check trim
        assert (c.trim());
    }

    private static void checkNullSafeOperations() {
        // Check create collection
        CustomCollection c = new LinkedListCollectionImpl();
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

        // Check equals
        CustomCollection c1 = new LinkedListCollectionImpl();
        assert(c.add(null));
        assert(c1.add("one"));
        assert(c1.add(null));
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
