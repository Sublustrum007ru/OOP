
import java.time.LocalDate;
import OOP.scr.Personal;

public class Doctor  extends Personal{
    public Doctor(String name, String jobTitle, LocalDate age, double workExperience){
        super(name, jobTitle, age, workExperience);
    }

    public void prescribesVitamins(){
        System.out.println("Прописывает витамины.");
    }

    public void perscribesInjection(){
        System.out.println("Прописывает укол.");
    }

    
}
