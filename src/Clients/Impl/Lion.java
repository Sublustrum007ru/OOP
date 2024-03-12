package Clients.Impl;

import Clients.Animal;
import Clients.Goable;
import Clients.Owner;
import Clients.Swimmable;

public class Lion extends Animal implements Swimmable, Goable{
    public Lion (String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }
    public Lion(){
        super();
    }
    @Override
    public void eat(){
        System.out.println(getType() + " кушает.");
    }
    @Override
    public double swimm(){
        return 4;
    }
    @Override
    public double go(){
        return 12;
    }
}