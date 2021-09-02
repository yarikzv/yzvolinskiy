package homeWork6;

/**
 * The class GuideDog represents the Guide-dog and extends Dog class and have two constructors
 * for creating animals with specific parameters boolean isTrained and with all.
 * The field is private ant has getter and setter.
 * */
public class GuideDog extends Dog {
    private boolean isTrained;

    public GuideDog(String name, boolean isTrained) {
        super(name);
        this.isTrained = isTrained;
    }
    public GuideDog(String id, int age, double weight, AnimalColor color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    /** Overriding the makeVoice() method for guide-dogs. */
    @Override
    public String makeVoice() {
        if (isTrained) {
            return super.makeVoice().concat(" I can take you home.");
        } else {
            return super.makeVoice();
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
        sb.append(", name = ").append(super.getName());
        sb.append(", is vaccinated = ").append(super.isVaccinated());
        sb.append(", is trained = ").append(isTrained);
        return sb.toString();
    }

}
