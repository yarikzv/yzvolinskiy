package homeWork9.AnimalsRefactored;

/**
 * The abstract class WildAnimals represents the wild animals and extends Animals and have two constructors
 * for creating animals with specific parameter boolean IsPredator and with all parameters.
 * The class WildAnimals implements VoiceMaking interface.
 * Overridden method makeVoice() has specific implementations for wild animals.
 * The field isPredator is private ant has getter and setter.
 * */
public abstract class WildAnimals extends Animals implements VoiceMaking{
    private boolean isPredator;

    public WildAnimals(boolean isPredator) {
        this.isPredator = isPredator;
    }
    public WildAnimals(String id, int age, double weight, AnimalColor color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    /**
     * Overriding the makeVoice() method for wild animals. If animals field isPredator is true -
     * calling another phrase*/
    @Override
    public String makeVoice() {
        if (isPredator) {
            return super.makeVoice().concat("I am a wild animal").concat(" and I am angry.");
        } else {
            return super.makeVoice().concat("I am a wild animal.");
        }
    }

    /** Overriding toString() method to display information as "Zoo Badge" using StringBuilder*/
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zoo Badge: ");
        sb.append("id = ").append(super.getId());
        sb.append(", age = ").append(super.getAge()).append(" years old");
        sb.append(", weight = ").append(super.getAge()).append(" kg");
        sb.append(", color = ").append(super.getColor());
        sb.append(", is predator = ").append(isPredator());
        return sb.toString();
    }
}
