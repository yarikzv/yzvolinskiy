package homeWork9.AnimalsRefactored;

/**
 * The class Wolf represents the Wolf and extends WildAnimals class and have two constructors
 * for creating animals with specific parameters boolean isPredator and with all.
 * */
public class Wolf extends WildAnimals {

    public Wolf(boolean isPredator) {
        super(isPredator);
    }
    public Wolf(String id, int age, double weight, AnimalColor color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

}
