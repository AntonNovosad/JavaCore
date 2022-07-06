package by.devincubator.task9.animals;

public class Kangaroo extends Animal {
    public Kangaroo() {
        super();
    }

    public Kangaroo(String animalName, int numberOfLegs, boolean hasMustache) {
        super(animalName, numberOfLegs, hasMustache);
    }

    @Override
    public void move() {
        System.out.println("jump-jump");
    }

    @Override
    public void isHungry() {
        System.out.println("i want berries");
    }

    @Override
    public void voice() {
        System.out.println("khe-khe");
    }
}
