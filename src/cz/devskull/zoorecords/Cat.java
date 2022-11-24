package cz.devskull.zoorecords;

public class Cat extends Animal{
    private boolean isSleeping;

    public Cat() {
        super();
    }

    @Override
    public void setAnimal() {
        try{
            super.setAnimal();
            System.out.println("Spí kočka v tuto dobu?");
            this.isSleeping = scanner.nextBoolean();
        }catch (Exception e){
            System.out.println("Něco si zadal špatně, zkus to znovu!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println((!isSleeping ? "Meeooow" : "Chrrrr meow meow meow"));
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Spí: " + isSleeping);
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }
}
