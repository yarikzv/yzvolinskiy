package homework6;

/**
 * The class Fish represents the Fish and extends Pets class and have two constructors
 * for creating animals with specific parameters String name and with all.
 * */
public class Fish extends Pets {

    public Fish(String name) {
        super(name);
    }
    public Fish(String id, int age, double weight, AnimalColor color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    /** Overriding the makeVoice() method for fish. */
    @Override
    public String makeVoice() {
        return "....";
    }

}
