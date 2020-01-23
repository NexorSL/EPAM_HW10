package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        List<Animal> animals = new ArrayList<>();

        animals.add(animalFactory.getAnimalByType("cat"));
        animals.add(animalFactory.getAnimalByType("cat"));
        animals.add(animalFactory.getAnimalByType("cat"));
        animals.add(animalFactory.getAnimalByType("dog"));
        animals.add(animalFactory.getAnimalByType("dog"));
        animals.add(animalFactory.getAnimalByType("dog"));


        for(Animal animal: animals){
            animal.eat();
        }
    }
}
