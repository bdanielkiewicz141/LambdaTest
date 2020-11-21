package pl.sda.javapol4.java_demo.di;

public class Main {
    public static void main(String[] args) {
        Engine small = new Engine(880);
        String color = "pink";
        Car car = new Car(small, color);
    }
}
