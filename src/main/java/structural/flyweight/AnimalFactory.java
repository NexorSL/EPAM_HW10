package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {
    private static final Map<String, Animal> animals = new HashMap<String, Animal>();

    public Animal getAnimalByType(String type){
        Animal animal = animals.get(type);

        if(animal == null){
            switch (type) {
                case "cat":
                    System.out.println("Cats go eat...");
                    animal = new Cat();
                    break;
                case "dog":
                    System.out.println("Dogs go eat...");
                    animal = new Dog();
            }
            animals.put(type, animal);
        }
        return animal;
    }

}
