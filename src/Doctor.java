package OOP.src;

import java.time.LocalDate;

public class Doctor extends Personal {

    public Doctor(String name, String jobTitle, LocalDate age, LocalDate startDate, LocalDate endDate, double workExperience) {
        super(name, jobTitle, age, startDate, endDate, CalcAge.calculateAge(startDate));
    }


    public void prescribesVitamins() {
        System.out.println("Прописывает витамины.");
    }

    public void perscribesInjection() {
        System.out.println("Прописывает укол.");
    }

}
