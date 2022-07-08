package by.devincubator.task9;

import by.devincubator.task9.animals.Animal;
import by.devincubator.task9.animals.Dragonfly;
import by.devincubator.task9.animals.Horse;
import by.devincubator.task9.animals.Kangaroo;

public class Task9 {
    public static void main(String[] args) {
        Animal[] herd = createAnimalsArray();

        Horse horse = new Horse("Horse 3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo 3", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly 3", 6, true);

        voiceAnimals(herd);
        horse.voice();
        kangaroo.voice();
        dragonfly.voice();

        System.out.println();
        moveAnimals(herd);
        horse.move();
        kangaroo.move();
        dragonfly.move();

        System.out.println();
        isHungryAnimals(herd);
        horse.isHungry();
        kangaroo.isHungry();
        dragonfly.isHungry();
    }

    private static Animal[] createAnimalsArray() {
        Animal[] herd = new Animal[7];
        herd[0] = new Horse("Horse", 4, false);
        herd[1] = new Horse("Horse 2", 4, false);
        herd[2] = new Kangaroo("Kangaroo", 4, true);
        herd[3] = new Kangaroo("Kangaroo 2", 4, true);
        herd[4] = new Dragonfly("Dragonfly", 6, true);
        herd[5] = new Dragonfly("Dragonfly 2", 6, true);
        herd[6] = new Animal("Unknown type", 10, true) {};
        return herd;
    }

    private static void voiceAnimals(Animal[] herd) {
        for (Animal a : herd) {
            a.voice();
        }
    }

    private static void moveAnimals(Animal[] herd) {
        for (Animal a : herd) {
            a.move();
        }
    }

    private static void isHungryAnimals(Animal[] herd) {
        for (Animal a : herd) {
            a.isHungry();
        }
    }
}
