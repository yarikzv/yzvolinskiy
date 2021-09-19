package homeWork9.AnimalsRefactored;

/**
 * The class Crocodile represents the Crocodile and extends WildAnimals class and have two constructors
 * for creating animals with specific parameters boolean isPredator and with all.
 * */
public class Crocodile extends WildAnimals {

    public Crocodile(boolean isPredator) {
        super(isPredator);
    }
    public Crocodile(String id, int age, double weight, AnimalColor color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

}
