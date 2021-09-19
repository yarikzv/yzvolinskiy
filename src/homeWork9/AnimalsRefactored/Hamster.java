package homeWork9.AnimalsRefactored;

/**
 * The class Hamster represents the Hamster and extends Pets class and have two constructors
 * for creating animals with specific parameters String name and with all.
 * */
public class Hamster extends Pets {

    public Hamster(String name) {
        super(name);
    }
    public Hamster(String id, int age, double weight, AnimalColor color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }
}
