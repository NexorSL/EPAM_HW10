package creational.factory;

public class Runner {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new OrangeFactory();
        Fruit fruit = fruitFactory.createFruit();

        fruit.dosmth();
    }
}
