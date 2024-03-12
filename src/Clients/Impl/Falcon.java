package Clients.Impl;

import Clients.Animal;
import Clients.Flyable;
import Clients.Owner;

public class Falcon extends Animal implements Flyable{
    public Falcon(String name, double weight, java.time.LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }

    public Falcon(){
        super();
    }
    @Override
    public void eat(){
        System.out.println(getType() + " клюет.");
    }
    @Override
    public double fly(){
        return 7;
    }
}