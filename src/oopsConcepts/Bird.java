package oopsConcepts;

public class Bird extends Animal {

    int age = 45;
    String color = "yellow";
    int weight = 300;

    public Bird(int age, String color, int weight) {
        super(age, color, weight);
        /*System.out.println("Bird age......" + age);
        System.out.println("Bird color......"+ color);
        System.out.println("Bird weight......" + weight);
        System.out.println("Bird age......" + super.age);
        System.out.println("Bird color......"+ super.color);
        System.out.println("Bird weight......" + super.weight);
        System.out.println("Bird age......" + this.age);
        System.out.println("Bird color......"+ this.color);
        System.out.println("Bird weight......" + this.weight);*/
    }

    @Override
    public void move() {
        System.out.println("Flapping wings .........");
    }

}
