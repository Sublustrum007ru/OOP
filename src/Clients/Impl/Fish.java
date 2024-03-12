package Clients.Impl;

import Clients.Animal;
import Clients.Owner;
import Clients.Swimmable;

public class Fish extends Animal implements Swimmable{
    public Fish(String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }
    public Fish(){
        super();
    }
    @Override
    public void eat(){
        System.out.println(getType() + " кушает.");
    }
    @Override
    public double swimm(){
        return 12;
    }
}