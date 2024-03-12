package Clients.Impl;

import Clients.Animal;
import Clients.Flyable;
import Clients.Owner;

public class Owl extends Animal implements Flyable{
    public Owl(String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);

    }
    public Owl(){
        super();
    }
    @Override
    public void eat(){
        System.out.println(getType() + " клюет.");
    }
    @Override
    public double fly(){
        return 5;
    }
}