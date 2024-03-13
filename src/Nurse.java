package OOP.src;

import java.time.LocalDate;


public class Nurse  extends Personal{
    public Nurse(String name, String jobTitle, LocalDate age, LocalDate startDate, LocalDate endDate, double workExperience){
        super(name, jobTitle, age, startDate, endDate, CalcAge.calculateAge(startDate));
    }

    public void givesVitamins(){
        System.out.println("Дает витамины.");
    }

    public void givesInjection(){
        System.out.println("Делает укол.");
    }
    
}