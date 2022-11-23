package cz.devskull.zoorecords;

public class Cat extends Animal{
    private boolean isSleeping;

    public Cat(String name, double weight, int age, boolean isSleeping, boolean isSleeping1) {
        super(name, weight, age);
        this.isSleeping = isSleeping1;
    }

    @Override
    public void makeSound() {
        System.out.println((!isSleeping ? "Meeooow" : "Chrrrr meow meow meow"));
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }
}
