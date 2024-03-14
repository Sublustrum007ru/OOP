package OOP.src.VeterinaryClinic.Personals;

import java.time.LocalDate;
import OOP.src.CalcAge;

public abstract class Personal {

    protected String name;
    protected String jobTitle;

    protected LocalDate age;
    protected LocalDate startDate;
    protected LocalDate endDate = LocalDate.now();
    protected double workExperience = CalcAge.calculateAge(startDate);
    public Personal(String name, String jobTitle, LocalDate age, LocalDate startDate, LocalDate endDate, double workExperience) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workExperience = CalcAge.calculateAge(startDate);

    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public LocalDate getAge() {
        return age;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getEndDate(){
        return endDate;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate){
        this.endDate = endDate;
    }
    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    public String toString() {
        return String.format("name = %s, jobTitlte = %s, age = %s, startDate = %s, endDate = %s, workExperience = %s лет", name, jobTitle, age, startDate, endDate,
                workExperience);
    }


}
