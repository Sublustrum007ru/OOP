package OOP.src.Clients.Impl;

import OOP.src.Clients.Animal;
import OOP.src.Clients.Goable;
import OOP.src.Clients.Owner;
import OOP.src.Clients.Swimmable;

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