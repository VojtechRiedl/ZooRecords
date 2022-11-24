package cz.devskull.zoorecords;

public class Dog extends Animal{
    private boolean huntingMood;

    public Dog() {
        super();
    }

    @Override
    public void setAnimal() {
        try{
            super.setAnimal();
            System.out.println("Má pes loveckou náladu?");
            this.huntingMood = scanner.nextBoolean();
        }catch (Exception e){
            System.out.println("Něco si zadal špatně, zkus to znovu!");
        }
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
