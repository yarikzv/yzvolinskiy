package homework6;

/**
 * The class Animals represents all the animals and have two constructors
 * for creating animals without parameters and with all.
 * All fields are private ant have getters and setters*/
public class Animals {
    private String id;
    private int age;
    private double weight;
    private AnimalColor color;

    public Animals() {
    }
    public Animals(String id, int age, double weight, AnimalColor color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public AnimalColor getColor() {
        return color;
    }

    public void setColor(AnimalColor color) {
        this.color = color;
    }

    /** makeVoice() method for all animals returns "Hello, " phrase */
    public String makeVoice() {
        return "Hello, ";
    }

}
