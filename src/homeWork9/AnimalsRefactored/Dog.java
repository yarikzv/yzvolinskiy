package homeWork9.AnimalsRefactored;

/**
 * The class Dog represents the Dog and extends Pets class and have two constructors
 * for creating animals with specific parameters String name and with all.
 * This class implements VoiceMaking interface, because it needs to implement specific
 * version of method makeVoice().
 */
public class Dog extends Pets implements VoiceMaking {

    public Dog(String name) {
        super(name);
    }

    public Dog(String id, int age, double weight, AnimalColor color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    /**
     * Overriding the makeVoice() method for dogs.
     */
    @Override
    public String makeVoice() {
        return super.makeVoice().concat(" Woof.");
    }

}
