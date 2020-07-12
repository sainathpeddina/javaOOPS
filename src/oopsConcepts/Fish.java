package oopsConcepts;

public class Fish extends Animal {

    public Fish(int age, String color, int weight) {
        super(age, color, weight);
    }

    @Override
    public void move() {
        System.out.println("fish swims..... .........");
    }

    public void swim()
    {
        System.out.println("Swimming...........");
    }
}
