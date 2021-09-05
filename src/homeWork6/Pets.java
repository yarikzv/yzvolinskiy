package homeWork6;

/**
 * The class Pets represents the pet animals and extends Animals and have two constructors
 * for creating animals with specific parameters String name and with all.
 * All fields are private ant have getters and setters.
 * */
public class Pets extends Animals {
    private String name;
    private boolean isVaccinated;

    public Pets(String name) {
        this.name = name;
    }
    public Pets(String id, int age, double weight, AnimalColor color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    /** Overriding the makeVoice() method for pet animals. */
    @Override
    public String makeVoice() {
        return super.makeVoice().concat("my name is ").concat(name).concat(".");
    }

    /** Overriding toString() method to display information as "Zoo Badge" using StringBuilder*/
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zoo Badge: ");
        sb.append("id = ").append(super.getId());
        sb.append(", age = ").append(super.getAge()).append(" years old");
        sb.append(", weight = ").append(super.getAge()).append(" kg");
        sb.append(", color = ").append(super.getColor());
        sb.append(", name = ").append(getName());
        sb.append(", is vaccinated = ").append(isVaccinated());
        return sb.toString();
    }

}
