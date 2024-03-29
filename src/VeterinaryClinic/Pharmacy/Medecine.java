package OOP.src.VeterinaryClinic.Pharmacy;

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

    public static List<String> createNameList(List<Medecine> medecineList){
        List<String> nameList = new ArrayList<>();
        for(Medecine list1 : medecineList) {
            nameList.add(createName(list1));
        }
        return nameList;
    }
    public static String createName(Medecine list){
        String name = "";
        for(MedecineComponents component : list){
            name = name + component.getName();
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

//    @Override
//    public int compareTo(Medecine medecineList) {
//        List<String> list1 = createNameList(Collections.singletonList(medecineList));
//        Collections.sort(list1);
//        for(String str : list1){
//            for(Medecine list2 : medecineList){
//                for(MedecineComponents list3 : list2) {
//                    System.out.println(str + " " + list3.getName());
//                }
//            }
//        }
//        return getClass().getSimpleName().compareTo(medecineList.getClass().getSimpleName());
//    }

    /*
    * Честно признаюсь, не смог понять как пркрутить созданное имя из имен компнентов
    * к сортировки списка Medecine.
    * Подсмотрел решение у одногрупника, у него написана сортировка по общей силе действующих компонентов
    * Так же и произведена сортировка самих компоненотво по возрастанию силы действующих компонентов
    *
    *
    * Переписал его код для работы с имп=енами компонентов.
    * Но все равное не доконца понял как он работает.
    */

    @Override
    public int compareTo(Medecine o) {
        Collections.sort(this.components, new Comparator<MedecineComponents>() {
            @Override
            public int compare(MedecineComponents o1, MedecineComponents o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
       Collections.sort(o.components, new Comparator<MedecineComponents>() {
            @Override
            public int compare(MedecineComponents o1, MedecineComponents o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        String name1 = "";
        for (MedecineComponents component : this.components){
            name1 += component.getName();
        }
        String name2 = "";
        for (MedecineComponents component : o.components){
            name2 += component.getName();
        }
        return name1.compareTo(name2);
    }

    public String toString(){

        return "Medecine: " + components.toString();
    }

}
