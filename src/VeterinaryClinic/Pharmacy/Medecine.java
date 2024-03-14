package OOP.src.VeterinaryClinic.Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medecine implements Iterator<MedecineComponents>, Comparable<Medecine>{
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

    @Override
    public int compareTo(Medecine component) {
        return 0;
    }

    @Override
    public boolean hasNext(){

        return index < components.size();
    }
    @Override
    public MedecineComponents next(){

        return components.get(index++);
    }

    public String toString(){

        return "Medecine: " + components.toString();
    }
}