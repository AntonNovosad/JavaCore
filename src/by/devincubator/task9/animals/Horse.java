package by.devincubator.task9.animals;

public class Horse extends Animal {
    public Horse() {
        super();
    }

    public Horse(String animalName, int numberOfLegs, boolean hasMustache) {
        super(animalName, numberOfLegs, hasMustache);
    }

    @Override
    public void move() {
        System.out.println("top-top");
    }

    @Override
    public void isHungry() {
        System.out.println("i want hay");
    }

    @Override
    public void voice() {
        System.out.println("I-go-go");
    }
}
