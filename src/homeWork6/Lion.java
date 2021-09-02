package homeWork6;

/**
 * The class Lion represents the Lion and extends WildAnimals class and have two constructors
 * for creating animals with specific parameters boolean isPredator and with all.
 * */
public class Lion extends WildAnimals {

    public Lion(boolean isPredator) {
        super(isPredator);
    }
    public Lion(String id, int age, double weight, AnimalColor color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    /** Overriding the makeVoice() method for lions. */
    @Override
    public String makeVoice() {
        return super.makeVoice();
    }

}
