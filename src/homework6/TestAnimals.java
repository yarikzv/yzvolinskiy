package homework6;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple program to demonstrate the creation of the Animals class and child classes
 *
 * @author Yaroslav Zvolinskiy
 * @version 0.0.1
 * */
public class TestAnimals {
    public static void main(String[] args) {
        testAnimalsFirstVersion();
        testAnimalsSecondVersion();
    }
    /**
     * This method demonstrate the creation each of classes members and calling
     * makeVoice() method for each manually.
     * It shows dependencies of methods option from class
     * */
    static void testAnimalsFirstVersion() {
        Cat cat = new Cat("Murzik");
        System.out.println("\uD83D\uDC31 \t" + cat.makeVoice());

        Dog dog = new Dog("Barbos");
        System.out.println("\uD83D\uDC36 \t" + dog.makeVoice());

        GuideDog guideDog = new GuideDog("Richard", true);
        System.out.println("\uD83E\uDDAE \t" + guideDog.makeVoice());
        GuideDog guideDog2 = new GuideDog("Bernard", false);
        System.out.println("\uD83E\uDDAE \t" + guideDog2.makeVoice());

        Hamster hamster = new Hamster("Zizi");
        System.out.println("\uD83D\uDC39 \t" + hamster.makeVoice());

        Fish fish = new Fish("Nemo");
        System.out.println("\uD83D\uDC1F \t" + fish.makeVoice());

        Lion lion = new Lion(true);
        System.out.println("\uD83E\uDD81 \t" + lion.makeVoice());

        Wolf wolf = new Wolf(true);
        System.out.println("\uD83D\uDC3A \t" + wolf.makeVoice());

        Giraffe giraffe = new Giraffe(false);
        System.out.println("\uD83E\uDD92 \t" + giraffe.makeVoice());

        Crocodile crocodile = new Crocodile(true);
        System.out.println("\uD83D\uDC0A \t" + crocodile.makeVoice());

        System.out.println("=======================================================");
    }

    /**
     * This method demonstrates the creation of each of the classes members
     * by adding to ArrayList created as Animals member and calling makeVoice() method
     * for each using foreach statement. Also, the toString() method was overridden to display information as "Zoo Badge"
     * It shows dependencies of methods option from class
     * */
    static void testAnimalsSecondVersion() {
        List<Animals> zoo = new ArrayList<>();
        zoo.add(new Cat("Cat", 5, 6, AnimalColor.BEIGE, "Murzik", true));
        zoo.add(new Dog("Dog", 5, 15, AnimalColor.GRAY, "Barbos", true));
        zoo.add(new GuideDog("Guide-Dog", 3, 26, AnimalColor.BLACK, "Richard", true, true));
        zoo.add(new GuideDog("Guide-Dog", 8, 33, AnimalColor.BROWN, "Bernard", true, false));
        zoo.add(new Hamster("Hamster", 1, 0.1, AnimalColor.WHITE, "Zizi", true));
        zoo.add(new Fish("Fish", 1, 0.2, AnimalColor.YELLOW, "Nemo", false));
        zoo.add(new Giraffe("Giraffe", 10, 239, AnimalColor.BROWN, false));
        zoo.add(new Crocodile("Crocodile", 9, 98, AnimalColor.GREEN, true));
        zoo.add(new Lion("Lion", 16, 165, AnimalColor.YELLOW, true));
        zoo.add(new Wolf("Wolf", 7, 45, AnimalColor.GRAY, true));

        System.out.println("=======================================================");

        for (Animals animal : zoo) {
            System.out.printf("%10s: %s\n", animal.getId(), animal.makeVoice());
        }

        System.out.println("=============================================================================================================================");

        for (Animals animal : zoo) {
            System.out.println(animal);
        }

        System.out.println("=============================================================================================================================");
    }
}

