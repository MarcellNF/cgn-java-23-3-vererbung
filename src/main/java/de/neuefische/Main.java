package de.neuefische;

import de.neuefische.animal.Animal;
import de.neuefische.animal.Cat;
import de.neuefische.animal.Snake;

public class Main {
    public static void main(String[] args) {
        Animal snake1 = new Snake(
                false,
                "Viper",
                false,
                200,
                "Nagini",
                "black",
                true
        );

        System.out.println(snake1.isHasLegs());

        System.out.println(snake1);
    }
}