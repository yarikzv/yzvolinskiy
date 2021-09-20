package homeWork10;

public class StringCollectionImpl implements StringCollection {
    private String[] array = new String[0];

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean add(String str) {
        String[] newArr = new String[array.length+1];

        return false;
    }

    @Override
    public boolean add(int index, String str) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean equals(StringCollection collection) {
        return false;
    }

    @Override
    public boolean clear() {
        array = new String[0];
        return false;
    }

    @Override
    public int size() {
        return array.length;
    }
}
