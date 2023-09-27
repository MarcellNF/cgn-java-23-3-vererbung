package de.neuefische.animal;

import java.util.Objects;

public class Animal {
    private boolean hasLegs;
    private String race;
    private boolean isVegetarian;

    public Animal(boolean hasLegs, String race, boolean isVegetarian) {
        this.hasLegs = hasLegs;
        this.race = race;
        this.isVegetarian = isVegetarian;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return hasLegs == animal.hasLegs && isVegetarian == animal.isVegetarian && Objects.equals(race, animal.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasLegs, race, isVegetarian);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "hasLegs=" + hasLegs +
                ", race='" + race + '\'' +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}
