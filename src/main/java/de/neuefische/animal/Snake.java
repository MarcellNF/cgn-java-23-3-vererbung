package de.neuefische.animal;

import java.util.Objects;

public class Snake extends Animal{
    private int length;
    private String name;
    private String color;
    private boolean isToxic;

    public Snake(boolean hasLegs, String race, boolean isVegetarian, int length, String name, String color, boolean isToxic) {
        super(hasLegs, race, isVegetarian);
        this.length = length;
        this.name = name;
        this.color = color;
        this.isToxic = isToxic;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isToxic() {
        return isToxic;
    }

    public void setToxic(boolean toxic) {
        isToxic = toxic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Snake snake = (Snake) o;
        return length == snake.length && isToxic == snake.isToxic && Objects.equals(name, snake.name) && Objects.equals(color, snake.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, name, color, isToxic);
    }

    @Override
    public String toString() {
        return "Snake{" +
                "hasLegs=" + super.isHasLegs() +
                ", race=" + super.getRace() +
                ", isVegetarian=" + super.isVegetarian() +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isToxic=" + isToxic +
                '}';
    }
}
