

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Rock", "dog", 5, 75, new String[]{"eat, drink, run"});
        Pet p = new Pet("Rock", "dog", 5, 75, new String[]{"eat, drink, run"});
        Pet cat = new Pet("Mock", "cat", 5, 85, new String[]{"eat, drink, sleep"});


        Human father = new Human("Vito", "Karleone", 1955,
                95,
                new String[][]{{"monday, do exercise"}}
        );

        Human mother = new Human("Jane", "Karleone", 1956,
                85,
                new String[][]{{"monday, do exercise"}, {"tuesday", "relax"}}
        );

        Human child = new Human("Michael", "Karleone", 1977,
                90,
                new String[][]{{"monday, do exercise"}, {"tuesday", "relax"}}
        );
        child.setPet(p);


        child.greetPet();
        child.describePet();
        p.respond();


        Random random = new Random();
        int secretNumber = random.nextInt(101);
        boolean feedTime;
        if (p.getTrickLevel() >= secretNumber) {
            feedTime = true;
        } else {
            feedTime = false;
        }
        child.feedPet(feedTime);


        p.eat();
        System.out.println(child);
        Family family = new Family(mother, father, new ArrayList<>(), p);

        family.addChild(child);
        family.deleteChild(0);

        System.out.println(family);
        System.out.println("Equality of dogs is " + pet.getNickName().equals(p.getNickName()));
        System.out.println("Equality of dog and cat is " + pet.getNickName().equals(cat.getNickName()));
        System.out.println(family.countFamily());
    }
}