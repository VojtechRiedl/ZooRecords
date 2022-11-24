package cz.devskull.zoorecords;

public enum AnimalType {
    DOG("Pes", Dog.class),
    CAT("Kočka", Cat.class),
    ELEPHANT("Slon",Elephant.class);

    private String czechVersion;
    private Class<Animal> animalClass;

    <T> AnimalType(String czechVersion, Class<T> Class){
        this.czechVersion = czechVersion;
        this.animalClass = (Class<Animal>) Class;
    }

    public Animal getAnimal(/*Object... args*/) throws Exception {
        //return (Animal) this.animalClass.getConstructors()[0].newInstance(args);
        return (Animal) this.animalClass.getConstructors()[0].newInstance();
    }
    public static AnimalType getAnimalTypeByName(String name) {
        for (AnimalType animalType : AnimalType.values()){
            if(animalType.czechVersion.equalsIgnoreCase(name)){
                return animalType;
            }
        }
        return null;
    }

    public String getCzechVersion() {
        return czechVersion;
    }
    public Class<Animal> getAnimalClass() {
        return animalClass;
    }
}
