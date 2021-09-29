package homeWork12.Interfaces;


public interface CustomCollection {

    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(CustomCollection strColl);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean equals(CustomCollection coll);

}