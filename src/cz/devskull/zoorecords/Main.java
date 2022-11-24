package cz.devskull.zoorecords;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (true){
            System.out.println("Zadej operaci (+, print, -, exit):");
            switch (getOperation().toLowerCase()){
                case "+":
                    saveAnimal();
                    break;
                case "print":
                    printAnimal();
                    break;
                case "-":
                    removeAnimal();
                    break;
                case "exit":
                    System.out.println("Vypínám program!");
                    return;
                default:
                    System.out.println("Taková operace neexistuje");
                    break;
            }
        }
    }

    private static String getOperation(){
        String operation = null;
        try {
            operation = scanner.nextLine();
        }catch (Exception e){
            System.out.println("Musíš zadat operaci!");
        }
        return operation;
    }

    private static void saveAnimal() throws Exception{
        System.out.println("Zadej typ zvířete!");
        AnimalType animalType = AnimalType.getAnimalTypeByName(scanner.nextLine());
        if(animalType == null){
            System.out.println("Takové zvíře neexistuje! :(");
            return;
        }
        animalType.getAnimal();
    }
    private static void printAnimal(){
        String name = getName();
        if(checkAnimal(name)){
            Animal animal = Animal.animals.get(name);
            animal.print();
            animal.makeSound();
        }
    }
    private static void removeAnimal(){
        String name = getName();
        if(checkAnimal(name)){
            Animal.animals.remove(name);
            System.out.println("Zvíře úspěšně odstraněno!");
        }
    }

    private static boolean checkAnimal(String name){
        if(name == null){
            System.out.println("Toto není jméno!");
            return false;
        }
        if(!Animal.animals.containsKey(name)){
            System.out.println("Takové zvíře s jménem " + name + " neexistuje!");
            return false;
        }
        return true;
    }

    private static String getName(){
        System.out.println("Zadej jméno zvířete");
        String name = null;
        try{
            name = scanner.nextLine();
        }catch (Exception ignored){

        }
        return name;
    }
}