package OOP.src.VeterinaryClinic.Personals.Impl;

import java.time.LocalDate;

import OOP.src.CalcAge;
import OOP.src.VeterinaryClinic.Personals.Personal;


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