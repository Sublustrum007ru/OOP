package OOP.src.VeterinaryClinic.Clients.Impl;

import OOP.src.VeterinaryClinic.Clients.*;

public class Duck extends Animal implements Flyable, Swimmable, Goable{
    public Duck(String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }
    public Duck(){
        super();
    }
    @Override
    public void eat(){
        System.out.println(getType() + " клюет.");
    }
    @Override
    public double fly(){
        return 3;
    }
    @Override
    public double swimm(){
        return 8;
    }
    @Override
    public double go(){
        return 1;
    }
}