package by.devincubator.task9.animals;

public class Dragonfly extends Animal {
    public Dragonfly() {
        super();
    }

    public Dragonfly(String animalName, int numberOfLegs, boolean hasMustache) {
        super(animalName, numberOfLegs, hasMustache);
    }

    @Override
    public void move() {
        System.out.println("flight");
    }

    @Override
    public void isHungry() {
        System.out.println("i want insects");
    }

    @Override
    public void voice() {
        System.out.println("bj-w-w");
    }
}
