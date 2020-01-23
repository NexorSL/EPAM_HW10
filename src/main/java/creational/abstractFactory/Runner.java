package creational.abstractFactory;

import creational.abstractFactory.varus.VarusFruitFactory;

public class Runner {
    public static void main(String[] args) {
        VarusFruitFactory varusFruitFactory = new VarusFruitFactory();
        Apple goldenApple = varusFruitFactory.getApple();
        Banana redBanana = varusFruitFactory.getBanana();

        System.out.println("Varus has: ");
        goldenApple.getColor();
        redBanana.getColor();
    }
}
