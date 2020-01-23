package creational.builder;

public class FerrariCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Ferrari");
    }

    @Override
    void buildPrice() {
        car.setPrice("200.000$");
    }

    @Override
    void buildColor() {
        car.setColor("Red");
    }

}
