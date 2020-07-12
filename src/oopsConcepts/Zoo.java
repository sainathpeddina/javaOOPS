package oopsConcepts;

public class Zoo {
    public static void main(String[] args) {
       /* Animal animal1 = new Animal(10 ,"white" , 50);
        animal1.eat();
        animal1.sleep();*/

        /*Bird bird1 = new Bird(20 ,"black" , 100);
        bird1.fly();
        bird1.eat();
        bird1.sleep();*/

        //Chicken chicken1 = new Chicken(15 , "boiler" , 80);
        //chicken1.fly();

        Animal fish1 = new Fish(7, "red", 60);
        Animal sparow1 = new Sparrow(78, "orange", 600);
        Zoo z = new Zoo();
        moveAnimal(fish1);
        moveAnimal(sparow1);
    }

    public static void moveAnimal(Animal an) {
        an.move();
    }

}
