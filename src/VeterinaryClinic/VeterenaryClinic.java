package OOP.src.VeterinaryClinic;

import java.util.List;
import java.util.ArrayList;

import OOP.src.VeterinaryClinic.Clients.*;
import OOP.src.VeterinaryClinic.Personals.Personal;

public class VeterenaryClinic {

    private static List<Personal> personalList = new ArrayList<>();
    private static List<Animal> patientslList = new ArrayList<>();

    public static void addPersonal(Personal personal) {
        personalList.add(personal);
    }

    public static void addPatient(Animal patient) {
        patientslList.add(patient);
    }

    public static void delPersonal(String name) {
        for (int i = 0; i < personalList.size(); i++) {
            if (personalList.get(i).getName().equals(name)) {
                personalList.remove(i);
            }
        }
    }

    public static void whoPersonal(String args) {
        for (int i = 0; i < personalList.size(); i++) {
            if (personalList.get(i).getType().equals(args)) {
                System.out.println(personalList.get(i).getType() + " " + personalList.get(i));
            }
        }
    }

    public static void whoPersonal() {
        for (int i = 0; i < personalList.size(); i++) {
            System.out.println(personalList.get(i).getType() + " " + personalList.get(i));
        }
    }

    public static void whosFly() {
        for (Animal outList : patientslList) {
            if (outList instanceof Flyable) {
                System.out.println(outList.getType() + " '" + outList.getName() + "' летает.");
            }
        }
    }

    public static void whosGo() {
        for (Animal outList : patientslList) {
            if (outList instanceof Goable) {
                System.out.println(outList.getType() + " '" + outList.getName() + "' бегает.");
            }
        }
    }

    public static void whosSwimm() {
        for (Animal outList : patientslList) {
            if (outList instanceof Swimmable) {
                System.out.println(outList.getType() + " '" + outList.getName() + "' плавает.");
            }
        }
    }

}
