package oopsConcepts;

public class Sparrow extends Bird implements Flayable {

    public Sparrow(int age, String color, int weight) {
        super(age, color, weight);
    }
    public void fly() {
        System.out.println("can fly high .........");
    }
}
