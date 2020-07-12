package oopsConcepts;

public abstract class Animal {

    int age ;
    String color;
    int weight;

    public Animal(int age, String color, int weight) {
       this.age = 50 ;
       this.color = color; // same prints which comes from main method
       this.weight = 200;
    }

    public void eat() {
        System.out.println("eating......");
    }

    public void sleep() {
        System.out.println("sleep...........");
    }
    public abstract void move();
    }

