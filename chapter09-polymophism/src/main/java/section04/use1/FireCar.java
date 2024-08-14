package main.java.section04.use1;

public class FireCar extends Car implements Soundable {
    @Override
    public void go() {
        System.out.println("소방차가 달림");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춤");
    }

    @Override
    public void vamm() {
        System.out.println("소방차가 경적을 울림");
    }
}
