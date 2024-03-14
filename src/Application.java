package OOP.src;

import OOP.src.VeterinaryClinic.*;
import OOP.src.VeterinaryClinic.Clients.*;
import OOP.src.VeterinaryClinic.Clients.Impl.*;
import OOP.src.VeterinaryClinic.Personals.*;
import OOP.src.VeterinaryClinic.Personals.Impl.*;


import java.time.*;

public class Application {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void app() {
        clearScreen();
        System.out.println("*****************************");

        Personal doctor_1 = new Doctor("Altair", "Doctor", LocalDate.of(1986, 3, 31), LocalDate.of(2010, 1, 10),
                LocalDate.now(), 1);
        Personal nurse_1 = new Nurse("Tusia", "Nurse", LocalDate.of(2005, 10, 16), LocalDate.of(2016, 1, 17),
                LocalDate.now(), 1);
        Personal doctor_2 = new Doctor("Viktor", "Doctor", LocalDate.of(1990, 12, 15), LocalDate.of(2011, 3, 25),
                LocalDate.now(), 1);
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

        VeterenaryClinic.addPersonal(doctor_1);
        VeterenaryClinic.addPersonal(nurse_1);

        VeterenaryClinic.addPatient(falcon_1);
        VeterenaryClinic.addPatient(owl_1);
        VeterenaryClinic.addPatient(lion_1);
        VeterenaryClinic.addPatient(dog_1);
        VeterenaryClinic.addPatient(cat_1);
        VeterenaryClinic.addPatient(fish_1);
        VeterenaryClinic.addPatient(duck_1);
        System.out.println("*****************************");
        System.out.println("Список тех кто умеет летать");
        VeterenaryClinic.whosFly();
        System.out.println("Список тех кто умеет бегать");
        VeterenaryClinic.whosGo();
        System.out.println("Список тех кто умеет плавать");
        VeterenaryClinic.whosSwimm();
        System.out.println("*****************************");
        System.out.println("Cписок докторов");
        VeterenaryClinic.whoPersonal("Doctor");
        System.out.println("Список медсестер");
        VeterenaryClinic.whoPersonal("Nurse");
        System.out.println("*****************************");
        VeterenaryClinic.addPersonal(doctor_2);
        System.out.println("Список докторов после добавление нового");
        VeterenaryClinic.whoPersonal("Doctor");
        System.out.println("*****************************");
        VeterenaryClinic.delPersonal("Altair");
        System.out.println("Список докторов после удаление");
        VeterenaryClinic.whoPersonal("Doctor");

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
