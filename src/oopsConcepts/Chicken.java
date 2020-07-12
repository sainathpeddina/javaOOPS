package oopsConcepts;

public class Chicken extends Bird implements Flayable {
    public Chicken(int age, String color, int weight) {
        super(age, color, weight);
    }

    //overridding the parent method
    public void fly() {
        //super.fly(); can access fly method of bird class(Immediate to parent)
        System.out.println("can not fly xxxxxxxxxx ");
    }

}
