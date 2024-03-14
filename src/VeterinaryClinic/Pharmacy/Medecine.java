package OOP.src.VeterinaryClinic.Pharmacy;

import OOP.src.VeterinaryClinic.Pharmacy.Impl.Asitromin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Medecine implements Iterable<MedecineComponents>, Comparable<Medecine> {
    private List<MedecineComponents> components;
    private int index;

    private String name;

    public Medecine(String name){
        this.name = name;
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medecine addComponent(MedecineComponents component){
        components.add(component);
        return this;
    }
    public String getName(){
        return name;
    }

    public static void printMedecineList(List<Medecine> medecineList){
        Collections.sort(medecineList);
        for(Medecine list1 : medecineList){
            System.out.println(list1.getName());
        }
    }
    public static void printMedecineSort(List<Medecine> medecineList){
        Collections.sort(medecineList);
        for(Medecine list1 : medecineList){
            System.out.println(list1.getName());
        }
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
        return name.compareTo(o.name);
    }

    public String toString(){

        return "Medecine: " + name + components.toString();
    }

}