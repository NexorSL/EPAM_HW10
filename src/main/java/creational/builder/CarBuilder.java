package creational.builder;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildName();

    abstract void buildPrice();

    abstract void buildColor();

    Car getCar(){
        return car;
    }
}
