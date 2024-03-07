import java.time.LocalDate;

import Clients.*;
import Clients.Owner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Lion lion_1 = new Lion("lewa", 50, LocalDate.now(), new Owner());
        Lion lion_2 = new Lion("kuzya", 75, LocalDate.now(), new Owner());
        System.out.println();
        System.out.println(lion_1.getType() + ":");
        System.out.println(lion_1.toString());
        System.out.println(lion_2.toString());
        Dog cat_1 = new Dog("pushok", 5, LocalDate.now(), new Owner());
        System.out.println();
        System.out.println(cat_1.getType() + ":");
        System.out.println(cat_1.toString());
        Dog dog_1 = new Dog("djec", 15, LocalDate.now(), new Owner());
        System.out.println();
        System.out.println(dog_1.getType() + ":");
        System.out.println(dog_1.toString());
        System.out.println();
        System.out.println(lion_1.getAge());

        System.out.println(lion_1.getWeight());
        lion_1.setWeight(55);
        System.out.println(lion_1.getWeight());

        Lion lion_3 = new Lion();
        System.out.println(lion_3);
        System.out.println();
        lion_1.liveCycl();

        List<Animal> animal = new ArrayList<>();
        animal.add(lion_1);
        animal.add(lion_2);
        animal.add(cat_1);
        animal.add(dog_1);

        System.out.println(animal);

    }
}