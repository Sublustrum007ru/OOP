package Clients.Impl;

import Clients.*;

public class Ducks extends Animal implements Flyable, Swimmable, Goable{
    public Ducks(String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }
    public Ducks(){
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
        return 5;
    }
    @Override
    public double go(){
        return 1;
    }
}