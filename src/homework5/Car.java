package homework5;

/**
 * This class represents a simple car.
 * It has three fields:
 * - tankCapacity - capacity of fuel tank
 * - fuelRemaining - fuel remaining quantity
 * - litersPerHundred - fuel consumption in liters per 100 km.
 * Methods:
 * - fillFullTank() method returns quantity of fuel to full tank filling needed.
 * And sets fuelRemaining quantity to tankCapacity. Math.round and multiplying by 100.0
 * and then dividing by 100.0 used to displaying result amount in two symbols after dot.
 * - fuelRemainingAfterDriving method returns quantity of fuel to full tank filling needed
 * after driving  a distance.
 * -calculateFillFullTankAfterDriving method calculate how much fuel need to fill to full tank*/
public class Car {
    private double tankCapacity;
    private double fuelRemaining;
    private double litersPerHundred;

    public double fillFullTank() {
        double fillVolume = Math.round((tankCapacity - fuelRemaining)*100.0)/100.0;
        System.out.println("До полного бака необходимо: " + fillVolume + " л.");
        fuelRemaining = tankCapacity;
        return fillVolume;
    }

    public void fuelRemainingAfterDriving(double distance) {
        double volumeForDistance = distance / 100.0 * litersPerHundred;
        fuelRemaining = Math.round((fuelRemaining - volumeForDistance)*100.0)/100.0;
        System.out.println("Остаток топлива: " + fuelRemaining + " л.");
    }

    public double calculateFillFullTankAfterDriving(double distance) {
        return Math.round((distance / 100 * litersPerHundred) * 100.0) / 100.0;
    }


    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRemaining() {
        return Math.round(fuelRemaining*100.0)/100.0;
    }

    public void setFuelRemaining(double fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }

    public double getLitersPerHundred() {
        return litersPerHundred;
    }

    public void setLitersPerHundred(double litersPerHundred) {
        this.litersPerHundred = litersPerHundred;
    }
}
