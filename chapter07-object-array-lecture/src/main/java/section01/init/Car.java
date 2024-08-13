package main.java.section01.init;

public class Car {

    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void driveMaxspeed() {
        System.out.println(name+"의 최대 속도 :"+speed);

    }
}
