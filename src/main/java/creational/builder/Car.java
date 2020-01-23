package creational.builder;

public class Car {
    private String name;
    private String price;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", color=" + color +
                '}';
    }
}
