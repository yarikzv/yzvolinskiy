package homework9.animalsrefactored;

import homework9.animalsrefactored.interfaces.VoiceMaking;

/**
 * The abstract class Animals represents all the animals and have two constructors
 * for creating animals without parameters and with all parameters.
 * The class Animals implements VoiceMaking interface.
 * Overridden method makeVoice() has specific implementations for all animals.
 * All fields are private ant have getters and setters.
 */
public abstract class Animals implements VoiceMaking {
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

    /**
     * makeVoice() method for all animals returns "Hello, " phrase
     */
    @Override
    public String makeVoice() {
        return "Hello, ";
    }

}
