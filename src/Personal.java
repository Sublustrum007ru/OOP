// package OOP.src;

import java.time.LocalDate;

public abstract class Personal {

    protected String name;

    protected LocalDate age;

    protected double workExperience;

    protected String jobTitle;

    public Personal(String name, String jobTitle, LocalDate age, double workExperience) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.workExperience = workExperience;

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

    public double getWorkExperience() {
        return workExperience;
    }

    public String setJobTitle(String jobString) {
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return String.format("name = %s, jobTitlte = %s, age = %s, workExperience = %s лет", name, jobTitle, age,
                workExperience);
    }

}
