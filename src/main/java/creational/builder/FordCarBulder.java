package creational.builder;

public class FordCarBulder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Ford");
    }

    @Override
    void buildPrice() {
        car.setPrice("80.000$");
    }

    @Override
    void buildColor() {
        car.setColor("Blue");
    }
}
