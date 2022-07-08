package by.devincubator.task9.animals;

import by.devincubator.task9.action.Movable;
import by.devincubator.task9.action.Starveble;
import by.devincubator.task9.action.Voiceable;

public abstract class Animal implements Movable, Starveble, Voiceable {
    String animalName;
    int numberOfLegs;
    boolean hasMustache;

    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, boolean hasMustache) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.hasMustache = hasMustache;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
