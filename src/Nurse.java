import java.time.LocalDate;
import OOP.scr.Personal;

public class Nurse  extends Personal{
    public Nurse(String name, String jobTitle, LocalDate age, double workExperience){
        super(name, jobTitle, age, workExperience);
    }

    public void givesVitamins(){
        System.out.println("Дает витамины.");
    }

    public void givesInjection(){
        System.out.println("Делает укол.");
    }
    
}