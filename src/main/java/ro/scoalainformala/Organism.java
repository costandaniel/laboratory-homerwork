package ro.scoalainformala;

public abstract class Organism {
    private String name;
    private int numberOfLegs;

    public Organism(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }

    public abstract String makeSounds();

}
