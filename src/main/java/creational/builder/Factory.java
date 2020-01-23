package creational.builder;

public class Factory {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildName();
        builder.buildPrice();
        builder.buildColor();

        Car car = builder.getCar();

        return car;
    }
}
