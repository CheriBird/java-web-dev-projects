import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // should print true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());  // should print 13

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise());   // should print "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise());    // should print "Hello, my name is Cheshire!"

        Cat salem = new Cat(8);

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());   // should print the cat's name
        // As long as suki really is a HouseCat, this works
        System.out.println(((HouseCat) suki).isSatisfied());
    }

}

