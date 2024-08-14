package main.java.section04.use1;

public class RacingCar extends Car {
    @Override
    public void go() {
        System.out.println("레이싱카 달림");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카 멈춤");
    }
}
