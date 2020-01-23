package creational.factory;

public class AppleFactory implements FruitFactory {
    public Fruit createFruit() {
        return new Apple();
    }
}
