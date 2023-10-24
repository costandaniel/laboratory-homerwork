package ro.scoalainformala;

public class Elephant extends Organism {
    public Elephant(String name, int numberOfLegs){
        super(name,numberOfLegs);
    }
    public String makeSounds(){
        return "Pawoo!";
    }
    public String toString() {
        return "The name is " + this.getName();
    }
}
