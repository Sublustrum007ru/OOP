package OOP.src;
import java.util.List;

import Clients.*;

public class VeterenaryClinic {
    public String whosFly(List<Animal> list){
        String result = null;
        for(Animal outList : list){
            if(outList instanceof Flyable){
                result = "Good";
            }else{
                result = "Bad";
            }
        }
        return result;
    }
}
