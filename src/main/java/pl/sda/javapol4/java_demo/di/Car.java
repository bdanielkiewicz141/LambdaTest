package pl.sda.javapol4.java_demo.di;

public class Car {
private Engine engine;
private String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}
