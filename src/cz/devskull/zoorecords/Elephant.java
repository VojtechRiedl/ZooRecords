package cz.devskull.zoorecords;

import java.sql.SQLOutput;

public class Elephant extends Animal{
    public Elephant() {
        super();
    }

    @Override
    public void setAnimal() {
        try{
            super.setAnimal();
        }catch (Exception e){
            System.out.println("Něco si zadal špatně, zkus to znovu!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Frrrrrrrrrr");
    }
}
