package cz.devskull.zoorecords;

public enum AnimalType {
    DOG("Pes", Dog.class),
    CAT("Kočka", Cat.class),
    ELEPHANT("Slon",Elephant.class);

    private String czechVersion;
    private Class animalClass;

    AnimalType(String czechVersion, Class animalClass){
        this.czechVersion = czechVersion;
        this.animalClass = animalClass;
    }

    public Animal getAnimal() throws Exception {
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
