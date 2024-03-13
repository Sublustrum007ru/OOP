package OOP.src.Clients.Impl;
import OOP.src.Clients.Animal;
import OOP.src.Clients.Owner;
import OOP.src.Clients.Swimmable;

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