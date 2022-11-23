package cz.devskull.zoorecords;

public class Dog extends Animal{
    private boolean huntingMood;

    public Dog(String name, double weight, int age, boolean huntingMood) {
        super(name, weight, age);
        this.huntingMood = huntingMood;
    }

    @Override
    public void makeSound() {
        System.out.println((huntingMood ? "Vrrrrrr Haf Haf" : "Haf!"));
    }

    public boolean isHuntingMood() {
        return huntingMood;
    }

    public void setHuntingMood(boolean huntingMood) {
        this.huntingMood = huntingMood;
    }
}
