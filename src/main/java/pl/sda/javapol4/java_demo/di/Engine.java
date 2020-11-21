package pl.sda.javapol4.java_demo.di;

public class Engine {
private int captivity;

    public Engine(int captivity) {
        this.captivity = captivity;
    }

    public int getCaptivity() {
        return captivity;
    }

    public void setCaptivity(int captivity) {
        this.captivity = captivity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "captivity=" + captivity +
                '}';
    }
}
