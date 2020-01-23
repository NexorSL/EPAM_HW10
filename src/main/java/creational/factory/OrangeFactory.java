package creational.factory;

public class OrangeFactory implements FruitFactory{
    public Fruit createFruit() {
        return new Orange();
    }
}
