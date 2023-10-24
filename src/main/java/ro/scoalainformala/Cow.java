package ro.scoalainformala;

import java.util.Objects;

public class Cow extends Organism{
    private String color;

    public Cow(String name, int numberOfLegs,String color){
        super(name,numberOfLegs);
        this.color = color;
    }
    public String makeSounds(){
        return "Moooow!";
    }

    @Override
    public String toString() {
        return "The name is " + this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return Objects.equals(color, cow.color);
    }
}
