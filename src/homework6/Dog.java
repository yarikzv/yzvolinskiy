package homework6;

/**
 * The class Dog represents the Dog and extends Pets class and have two constructors
 * for creating animals with specific parameters String name and with all.
 * */
public class Dog extends Pets {

    public Dog(String name) {
        super(name);
    }
    public Dog(String id, int age, double weight, AnimalColor color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    /** Overriding the makeVoice() method for dogs. */
    @Override
    public String makeVoice() {
        return super.makeVoice().concat(" Woof.");
    }

}
