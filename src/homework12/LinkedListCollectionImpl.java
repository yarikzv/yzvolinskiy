package homework12;

import homework12.interfaces.CustomCollection;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * Realization of LinkedList collection class. Implements CustomCollection interface.
 *
 */
public class LinkedListCollectionImpl implements CustomCollection {
    private int size;
    private Node first;
    private Node last;


    @Override
    public boolean add(String str) {
        linkLast(str);
        return true;
    }

    public boolean addFirst(String str) {
        linkFirst(str);
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String str : strArr) {
            linkLast(str);
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        String[] array = toArray(strColl);
        addAll(array);
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index >= 0 && index < size) {
            Node deleteCandidate = nodeByIndex(index);
            unlink(deleteCandidate);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(String str) {
        if (str == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.value == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (str.equals(x.value)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return nodeByIndex(index).value;
    }

    @Override
    public boolean contains(String str) {
        if (str == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.value == null) {
                    return true;
                }
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (str.equals(x.value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        if (first == null) {
            return false;
        } else {
            first = last = null;
            size = 0;
            return true;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        if (first == null) {
            return false;
        } else {
            first.prev = last;
            last.next = first;
            return true;
        }
    }

    /**
     * This equals() method returns true if size and each of elements of collections are equal.
     * Works with null elements.
     *
     * @param coll Collection that implements CustomCollection interface
     * @return True if size and each of elements of collections are equal
     */
    @Override
    public boolean equals(CustomCollection coll) {
        Object[] collArray = toArray(coll);
        if (coll == null || collArray.length != size) return false;
        int i = 0;
        boolean result = false;
        for (Node x = first; x != null; x = x.next) {
            try {
                result = x.value.equals(collArray[i]);
            } catch (NullPointerException e) {
                if (x.value == null && collArray[i] == null) return true;
            }
            i++;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, first, last);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        Node current = first;
        while (current != null) {
            stringJoiner.add(current.value);
            current = current.next;
        }
        return stringJoiner.toString();
    }

    /**
     * Check if index is in range.
     *
     * @param index Index of element
     * @throws IndexOutOfBoundsException If index is out of range
     */
    private void checkIndex(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException("Index " + index + " not found");
        }
    }

    /**
     * Convert collection to array of String elements.
     *
     * @param collection Collection.
     * @return Array of elements from collection.
     */
    private static String[] toArray(CustomCollection collection) {
        String[] result = new String[collection.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = collection.get(i);
        }
        return result;
    }

    /**
     * Links element as first.
     *
     * @param str Element to link.
     */
    private void linkFirst(String str) {
        Node f = first;
        Node temp = new Node(null, str, f);
        first = temp;
        if (f == null) {
            last = temp;
        } else {
            f.prev = temp;
        }
        size++;
    }

    /**
     * Links element as last.
     *
     * @param str Element to link.
     */
    private void linkLast(String str) {
        Node l = last;
        Node temp = new Node(l, str, null);
        last = temp;
        if (l == null) {
            first = temp;
        } else {
            l.next = temp;
        }
        size++;
    }

    /**
     * Unlinks element.
     *
     * @param deleteCandidate Element to unlink.
     */
    private void unlink(Node deleteCandidate) {
        if (deleteCandidate.next == null) {
            last = deleteCandidate.prev;
        } else {
            deleteCandidate.next.prev = deleteCandidate.prev;
        }
        if (deleteCandidate.prev == null) {
            first = deleteCandidate.next;
        } else {
            deleteCandidate.prev.next = deleteCandidate.next;
        }
        size--;
    }

    /**
     * Gets Node object by index.
     *
     * @param index Index of element.
     * @return Node by index.
     */
    private Node nodeByIndex(int index) {
        if (index < (size / 2)) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            Node temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }
    }

    /**
     * Node - element of collection with next and previous links.
     */
    private static class Node {
        String value;
        Node next;
        Node prev;

        public Node(Node prev, String value, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}







