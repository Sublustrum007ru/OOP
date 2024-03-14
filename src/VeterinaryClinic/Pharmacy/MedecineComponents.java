package OOP.src.VeterinaryClinic.Pharmacy;

public abstract class MedecineComponents implements Comparable<MedecineComponents>{
    
    private String name;
    private float weight;
    private int power;   // Сила действующего вещества

    public MedecineComponents(String name, float weight, int power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(MedecineComponents component) {
        return power - component.power;

//        return Integer.compare(this.power, component.power);
//        if(this.power < component.power){
//            return -1;
//        }else if (this.power > component.power){
//            return 1;
//        }else
//            return 0;

//        return name.compareTo(component.name); // сортировка по строкам

    }

    @Override
    public String toString() {
        return "MedecineComponents{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }

}