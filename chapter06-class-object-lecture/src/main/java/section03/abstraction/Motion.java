package main.java.section03.abstraction;

public class Motion {



    private final Car car = new Car();

    public void startUp() {
        car.start(false);
    }

    public void stepAccelation() {
        car.go(0);
    }
    public void stopBreak() {
        car.stop();
    }
    public Car turnOff() {
        car.turnOff();
        return null;
    }
}
