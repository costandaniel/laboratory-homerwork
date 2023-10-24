package ro.scoalainformala;

public class Elk extends Organism{
    public Elk(String name, int numberOfLegs){
        super(name,numberOfLegs);
    }
    public String makeSounds(){
        return "Growl";
    }
    public String toString() {
        return "The name is " + this.getName();
    }

}
