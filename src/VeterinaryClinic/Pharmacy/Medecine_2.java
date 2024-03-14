package OOP.src.VeterinaryClinic.Pharmacy;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medecine_2 implements Iterable<MedecineComponents>{
    private List<MedecineComponents> components;
    private int index;
    public Medecine_2(){
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medecine_2 addComponent(MedecineComponents component){
        components.add(component);
        return this;
    }
//    @Override
//    public boolean hasNext(){
//        return index < components.size();
//    }
//    @Override
//    public MedecineComponents next(){
//        return components.get(index++);
//    }
    @Override
    public String toString(){
        return "Medecine: " + components.toString();
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

}