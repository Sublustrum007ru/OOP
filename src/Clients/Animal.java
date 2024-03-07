package Clients;

import java.time.*;

public class Animal{

    protected String name;

    protected double weight;

    protected LocalDate age;

    protected Owner owner;

    public Animal(String name, double weight, java.time.LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public Animal() {
        this("Defaul_Name", 20, LocalDate.now(), new Owner());
    }

    private void Sleep(){
        System.out.println(getType() + " sleep");
    }

    private void Wakeup(){
        System.out.println(getType() + " wakeup");
    }

    private void Wakeup(String time){
        System.out.println(getType() + " wakeup in " + time);
    }

    private void Eat(double eats){
        System.out.println(getType() + " ate " + eats + " kg of meat");
    }

    private void Play(){
        System.out.println(getType() + " play");
    }

    public void toGo(){
        System.out.println(getType() + " toGo");
    }

    public void toFly(){
        System.out.println(getType() + " toFly");
    }

    public void toSwim(){
        System.out.println(getType() + " toSwim");        
    }

    public void liveCycl(String time, double eats){
        Wakeup(time);
        Eat(eats);
        Play();
        Sleep();
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public String getName(){
        return name;
    }

    public Double getWeight(){
        return weight;
    }

    public LocalDate getAge(){
        return age;
    }

    public Owner getOwner(){
        return owner;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public String toString(){

        return String.format("name = %s, weight = %s, age = %s, owner = %s", name, weight, age, owner);
    }

}