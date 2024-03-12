package Clients.Impl;

import Clients.Animal;
import Clients.Goable;
import Clients.Owner;
import Clients.Swimmable;

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