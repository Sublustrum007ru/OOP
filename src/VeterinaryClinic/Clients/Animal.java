package OOP.src.VeterinaryClinic.Clients;

import java.time.*;

public abstract class Animal{

    protected String name;

    protected double weight;

    protected LocalDate age;

    protected Owner owner;

    public Animal(String name, double weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public Animal() {
        this("Defaul_Name", 20, LocalDate.now(), null);

    }
/*  Old code Lesson_1
    private void Sleep(){
        System.out.println("The " + getType() + " sleep");
    }

    private void Wakeup(){
        System.out.println("The " + getType() + " wakeup");
    }

    private void Wakeup(String time){
        System.out.println("The " + getType() + " wakeup in " + time);
    }

    private void Eat(){
        System.out.println("The " + getType() + " ate ");
    }

    private void Play(){
        if(getClass().getSimpleName().equals("Lion")){
            System.out.println("The " + getClass().getSimpleName() + " is playing.");
        }else if(getClass().getSimpleName().equals("Dog")){
            System.out.println("The " + getClass().getSimpleName() + " is playing.");
        }else if(getClass().getSimpleName().equals("Cat")){
            System.out.println("The " + getClass().getSimpleName() + " is playing.");
        }
    }

    public void toGo(){
        if(getClass().getSimpleName().equals("Lion")){
            System.out.println("The " + getClass().getSimpleName() + " is running.");
        }else if(getClass().getSimpleName().equals("Dog")){
            System.out.println("The " + getClass().getSimpleName() + " is running.");
        }else if(getClass().getSimpleName().equals("Cat")){
            System.out.println("The " + getClass().getSimpleName() + " is running.");
        }else if(getClass().getSimpleName().equals("Duck")){
            System.out.println("The " + getClass().getSimpleName() + " is running.");
        }
    }

    public void toFly(){
        if(getClass().getSimpleName().equals("Falcon")){
            System.out.println("The " + getClass().getSimpleName() + " is flying.");
        }else if(getClass().getSimpleName().equals("Owl")){
            System.out.println("The " + getClass().getSimpleName() + " is flying.");
        }else if(getClass().getSimpleName().equals("Duck")){
            System.out.println("The " + getClass().getSimpleName() + " is flying.");
        }
    }

    public void toSwim(){
        if(getClass().getSimpleName().equals("Lion")){
            System.out.println("The " + getClass().getSimpleName() + " is swim.");
        }else if(getClass().getSimpleName().equals("Dog")){
            System.out.println("The " + getClass().getSimpleName() + " is swim.");
        }else if(getClass().getSimpleName().equals("Cat")){
            System.out.println("The " + getClass().getSimpleName() + " is swim.");
        }else if(getClass().getSimpleName().equals("Fish")){
            System.out.println("The " + getClass().getSimpleName() + " is swim.");
        }else if(getClass().getSimpleName().equals("Duck")){
            System.out.println("The " + getClass().getSimpleName() + " is swim.");
        }        
    }

    public void liveCycle(String time){
        Wakeup(time);
        Eat();
        Play();
        toGo();
        toFly();
        toSwim();
        Sleep();
    }
    public void liveCycle(){
        Wakeup();
        Eat();
        Play();
        toGo();
        toFly();
        toSwim();
        Sleep();
    }
*/

    public abstract void eat();

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