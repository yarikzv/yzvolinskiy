package homeWork9.AnimalsRefactored;

/**
 * The class Cat represents the Cat and extends Pets class and have two constructors
 * for creating animals with specific parameters String name and with all parameters.
 * This class implements VoiceMaking interface, because it needs to implement specific
 * version of method makeVoice().
 */
public class Cat extends Pets implements VoiceMaking {

    public Cat(String name) {
        super(name);
    }

    public Cat(String id, int age, double weight, AnimalColor color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    /**
     * Overriding the makeVoice() method for cats.
     */
    @Override
    public String makeVoice() {
        return super.makeVoice().concat(" Meow.");
    }

}
