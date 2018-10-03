package domain;

public class Car {
    private int carPosition = 0;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        carPosition++;
    }

    public int getCarPosition() {
        return carPosition;
    }
    public String getName() { return name; }
}
