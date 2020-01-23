package creational.builder;

public class Runner {
    public static void main(String[] args) {
        Factory factory = new Factory();

        factory.setBuilder(new FerrariCarBuilder());
        Car car = factory.buildCar();

        System.out.println(car);
    }
}
