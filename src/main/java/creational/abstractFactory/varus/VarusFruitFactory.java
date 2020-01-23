package creational.abstractFactory.varus;

import creational.abstractFactory.Apple;
import creational.abstractFactory.Banana;
import creational.abstractFactory.FruitFactory;

public class VarusFruitFactory implements FruitFactory {
    public Apple getApple() {
        return new GoldenApple();
    }

    public Banana getBanana() {
        return new RedBanana();
    }
}
