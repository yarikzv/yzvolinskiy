package homework6;

/**
 * The class Giraffe represents the Giraffe and extends WildAnimals class and have two constructors
 * for creating animals with specific parameters boolean isPredator and with all.
 * */
public class Giraffe extends WildAnimals {

    public Giraffe(boolean isPredator) {
        super(isPredator);
    }
    public Giraffe(String id, int age, double weight, AnimalColor color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    /** Overriding the makeVoice() method for giraffes. */
    @Override
    public String makeVoice() {
        return super.makeVoice();
    }

}
