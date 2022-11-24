package cz.devskull.zoorecords;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Animal{

    public static HashMap<String,Animal> animals = new HashMap<>();
    protected Scanner scanner = new Scanner(System.in);
    private String name;
    private double weight;
    private int age;

    public Animal(){
        setAnimal();
        animals.put(name.toLowerCase(),this);
    }

    public void setAnimal(){
        System.out.println("Zadej jméno zvířete:");
        String name = scanner.nextLine();
        while (animals.containsKey(name.toLowerCase())){
            System.out.println("Toto jméno je již použité použí jiné");
            name = scanner.nextLine();
            if(!animals.containsKey(name.toLowerCase())){
                break;
            }
        }
        this.name = name;
        System.out.println("Zadej věk:");
        this.age = scanner.nextInt();
        System.out.println("Zadej Váhu");
        this.weight = scanner.nextDouble();
    }
    public abstract void makeSound();

    public void print(){
        System.out.println("Jméno: " + this.name);
        System.out.println("Věk: " + this.age);
        System.out.println("Váha: " + this.weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
