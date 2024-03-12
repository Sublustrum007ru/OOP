import Clients.*;
import Clients.Impl.*;

import java.time.*;
import java.util.List;

import java.util.ArrayList;

public class Application {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main() {
        clearScreen();
        System.out.println("*****************************");

        Personal doctor_1 = new Doctor("Altair", "Doctor", LocalDate.of(1986, 3, 31), 13.2);
        Personal nurse_1 = new Nurse("Tusia", "Nurse", LocalDate.of(2005, 10, 16), 5);

        Animal falcon_1 = new Falcon();
        Animal owl_1 = new Owl("CoffeOwl", 12.5, LocalDate.of(2002, 10, 20), new Owner());
        Animal lion_1 = new Lion("Pushok", 12.2, LocalDate.of(2002, 3, 15), new Owner());
        Animal dog_1 = new Dog("Djeck", 15, LocalDate.of(1999, 6, 12), new Owner());
        Animal cat_1 = new Cat();
        Animal fish_1 = new Fish("Dory", 0.20, LocalDate.of(2023, 2, 1), new Owner());
        /*
         * Почему то VSC начал ругаться на слово Duck. "The type Duck is ambiguous".
         * Создал новый класс "Ducks".
         * Animal duck_1 = new Duck("Selezen", 3.2, LocalDate.of(2022, 3, 6), new
         * Owner());
         */
        Animal duck_1 = new Ducks("Selezen", 3.2, LocalDate.of(2022, 3, 6), new Owner());

        List<Personal> personalList = new ArrayList<>();
        personalList.add(doctor_1);
        personalList.add(nurse_1);

        for (int i = 0; i < personalList.size(); i++) {
            System.out.println(personalList.get(i));
            
        }
        List<Animal> animalList = new ArrayList<>();
        animalList.add(falcon_1);
        animalList.add(owl_1);
        animalList.add(lion_1);
        animalList.add(dog_1);
        animalList.add(cat_1);
        animalList.add(fish_1);
        animalList.add(duck_1);

        whosFly(animalList);

    }

}

/*
 * old code Lesson_1
 * Lion lion_1 = new Lion("lewa", 50.2, LocalDate.of(2007,5,20), new Owner());
 * Lion lion_2 = new Lion("kuzya", 75.6, LocalDate.of(2004, 3,31), new Owner());
 * Cat cat_1 = new Cat("pushok", 5.1, LocalDate.of(2015, 8, 10), new Owner());
 * Dog dog_1 = new Dog("djec", 15.0, LocalDate.of(2014, 6, 25), new Owner());
 * Fish fish_1 = new Fish("Petushok", 0.15, LocalDate.of(2020, 12,3), new
 * Owner());
 * Falcon bird_1 = new Falcon("Sokol", 2.2, LocalDate.of(2015,1,17), new
 * Owner());
 * Duck duck_1 = new Duck("Selezen", 4.5, LocalDate.of(2022,5,16), new Owner());
 * Owl owl_1 = new Owl("CoffeOwl", 10.0, LocalDate.of(2023,7,18), new Owner());
 * 
 * System.out.println();
 * System.out.println(lion_1.getType() + ":");
 * System.out.println(lion_1.toString());
 * System.out.println(lion_2.toString());
 * System.out.println();
 * System.out.println(cat_1.getType() + ":");
 * System.out.println(cat_1.toString());
 * System.out.println();
 * System.out.println(dog_1.getType() + ":");
 * System.out.println(dog_1.toString());
 * System.out.println();
 * System.out.println(lion_1.getAge());
 * System.out.println(lion_1.getWeight());
 * lion_1.setWeight(55);
 * System.out.println(lion_1.getWeight());
 * Lion lion_3 = new Lion();
 * System.out.println(lion_3);
 * System.out.println();
 * lion_1.liveCycl("08:00", 15.0);
 * System.out.println();
 * 
 * List<Animal> animal = new ArrayList<>();
 * animal.add(lion_1);
 * animal.add(lion_2);
 * animal.add(cat_1);
 * animal.add(dog_1);
 * animal.add(bird_1);
 * animal.add(fish_1);
 * animal.add(duck_1);
 * animal.add(owl_1);
 * 
 * for (int i = 0; i < animal.size(); i++) {
 * System.out.println(animal.get(i).getClass().getSimpleName() + " " +
 * animal.get(i));
 * 
 * }
 * System.out.println("*****************************");
 * lion_1.liveCycle("08:00");
 * System.out.println("*****************************");
 * lion_2.liveCycle();
 * System.out.println("*****************************");
 * cat_1.liveCycle("04:00");
 * System.out.println("*****************************");
 * dog_1.liveCycle();
 * System.out.println("*****************************");
 * bird_1.liveCycle();
 * System.out.println("*****************************");
 * fish_1.liveCycle();
 * System.out.println("*****************************");
 * duck_1.liveCycle();
 * System.out.println("*****************************");
 * owl_1.liveCycle("23:00");
 * System.out.println("*****************************");
 */
