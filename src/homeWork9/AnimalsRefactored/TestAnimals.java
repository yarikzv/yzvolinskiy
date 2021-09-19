package homeWork9.AnimalsRefactored;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple program to demonstrate the creation of the Animals class and child classes.
 * Using Interface and Abstract classes.
 * Classes Animals, Pets and WildAnimals changed to abstract. Added VoiceMaking interface
 * for implementation of makeVoice() method in all classes that implements an interface.
 *
 * @author Yaroslav Zvolinskiy
 * @version 0.0.2
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
        System.out.println("\uD83D\uDC31 \t" + new Cat("Murzik").makeVoice());
        System.out.println("\uD83D\uDC36 \t" + new Dog("Barbos").makeVoice());
        System.out.println("\uD83E\uDDAE \t" + new GuideDog("Richard", true).makeVoice());
        System.out.println("\uD83E\uDDAE \t" + new GuideDog("Bernard", false).makeVoice());
        System.out.println("\uD83D\uDC39 \t" + new Hamster("Zizi").makeVoice());
        System.out.println("\uD83D\uDC1F \t" + new Fish("Nemo").makeVoice());
        System.out.println("\uD83E\uDD81 \t" + new Lion(true).makeVoice());
        System.out.println("\uD83D\uDC3A \t" + new Wolf(true).makeVoice());
        System.out.println("\uD83E\uDD92 \t" + new Giraffe(false).makeVoice());
        System.out.println("\uD83D\uDC0A \t" + new Crocodile(true).makeVoice());

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

