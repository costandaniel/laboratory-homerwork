package ro.scoalainformala;
import java.util.ArrayList;
import java.util.List;
public class Laboratory {
    public static void Main(String[] args) {
        List<Organism> list = new ArrayList<>();
        Cow cow = new Cow("Mirana",4,"Blue");
        list.add(cow);
        Elk elk = new Elk("Dinar",4);
        list.add(elk);
        Elephant elephant = new Elephant("Thomas",4);
        list.add(elephant);

        for(Organism organism : list){
            System.out.println(organism.makeSounds());
        }
    }
}
