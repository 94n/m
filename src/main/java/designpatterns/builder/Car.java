package designpatterns.builder;

public class Car {

    private int wheels;
    private String color;

    Car() {
    }

    String getColor() {
        return color;
    }

    void setColor(final String color) {
        this.color = color;
    }

    int getWheels() {
        return wheels;
    }

    void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", color = " + color + "]";
    }
}
