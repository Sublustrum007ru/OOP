import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import Clients.*;

public class Application {
    public static void main() {
        Lion lion_1 = new Lion("lewa", 50.2, LocalDate.now(), new Owner());
        Lion lion_2 = new Lion("kuzya", 75.6, LocalDate.now(), new Owner());
        Cat cat_1 = new Cat("pushok", 5.1, LocalDate.now(), new Owner());
        Dog dog_1 = new Dog("djec", 15.0, LocalDate.now(), new Owner());
        Fish fish_1 = new Fish("Petushok", 0.15, LocalDate.now(), new Owner());
        Bird bird_1 = new Bird("Sokol", 2.2, LocalDate.now(), new Owner());
        Duck duck_1 = new Duck("Selezen", 4.5, LocalDate.now(), new Owner());
        Owl owl_1 = new Owl("CoffeOwl", 10.0, LocalDate.now(), new Owner());

        // // System.out.println();
        // // System.out.println(lion_1.getType() + ":");
        // // System.out.println(lion_1.toString());
        // // System.out.println(lion_2.toString());
        // // System.out.println();
        // // System.out.println(cat_1.getType() + ":");
        // // System.out.println(cat_1.toString());
        // // System.out.println();
        // // System.out.println(dog_1.getType() + ":");
        // // System.out.println(dog_1.toString());
        // // System.out.println();
        // // System.out.println(lion_1.getAge());
        // // System.out.println(lion_1.getWeight());
        // // lion_1.setWeight(55);
        // // System.out.println(lion_1.getWeight());
        // // Lion lion_3 = new Lion();
        // // System.out.println(lion_3);
        // System.out.println();
        // lion_1.liveCycl("08:00", 15.0);
        // System.out.println();

        List<Animal> animal = new ArrayList<>();
        animal.add(lion_1);
        animal.add(lion_2);
        animal.add(cat_1);
        animal.add(dog_1);
        animal.add(bird_1);
        animal.add(fish_1);
        animal.add(duck_1);
        animal.add(owl_1);

        for (int i = 0; i < animal.size(); i++) {
            System.out.print(animal.get(i).getClass().getSimpleName() + " ");
            System.out.println(animal.get(i));

        }
        System.out.println("*****************************");
        lion_1.liveCycle("08:00");
        System.out.println("*****************************");
        lion_2.liveCycle();
        System.out.println("*****************************");
        cat_1.liveCycle("04:00");
        System.out.println("*****************************");
        dog_1.liveCycle();
        System.out.println("*****************************");
        bird_1.liveCycle();
        System.out.println("*****************************");
        fish_1.liveCycle();
        System.out.println("*****************************");
        duck_1.liveCycle();
        System.out.println("*****************************");
        owl_1.liveCycle();

    }
}