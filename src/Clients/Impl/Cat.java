package OOP.src.Clients.Impl;

import OOP.src.Clients.Animal;
import OOP.src.Clients.Goable;
import OOP.src.Clients.Owner;
import OOP.src.Clients.Swimmable;

public class Cat extends Animal implements Swimmable, Goable{
    public Cat(String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }
    public Cat(){
        super();
    }
    @Override
    public void eat(){
        System.out.println(getType() + " кушает.");
    }
    @Override
    public double swimm(){
        return 2;
    }
    @Override
    public double go(){
        return 2;
    }
}