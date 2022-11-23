package cz.devskull.zoorecords;

public class Elephant extends Animal{
    public Elephant(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Frrrrrrrrrr");
    }
}
