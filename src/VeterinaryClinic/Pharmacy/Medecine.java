package OOP.src.VeterinaryClinic.Pharmacy;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Medecine implements Iterable<MedecineComponents>, Comparable<Medecine>{
    private List<MedecineComponents> components;
    private int index;

    public Medecine(){
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medecine addComponent(MedecineComponents component){
        components.add(component);
        return this;
    }
    public static void printList(List<Medecine> medecineList){
        for(Medecine medecine : medecineList){
            System.out.println(medecine);
        }
    }

    public static String createName(Medecine componentList){
        String name = "";
        for(MedecineComponents list : componentList){
            name = name + list.getName();
        }
        return name;
    }

    @Override
    public Iterator<MedecineComponents> iterator() {
        return new Iterator<MedecineComponents>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedecineComponents next() {
                return components.get(index++);
            }
        };

    }

    @Override
    public int compareTo(Medecine o) {
        return getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }

    public String toString(){

        return "Medecine: " + components.toString();
    }

}