package OOP.src.VeterinaryClinic.Clients.Impl;

import OOP.src.VeterinaryClinic.Clients.*;

public class Dog extends Animal implements Swimmable, Goable{
    public Dog(String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }
    public Dog(){
        super();
    }
    @Override
    public void eat(){
        System.out.println(getType() + " кушает.");
    }
    @Override
    public double swimm(){
        return 3;
    }
    @Override
    public double go(){
        return 5;
    }
}