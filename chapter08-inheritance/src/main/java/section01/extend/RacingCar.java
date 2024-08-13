package main.java.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("RacingCar 기본 생성자 호출");
    }

    @Override
    public void run() {

        System.out.println("레이싱카가 달림");
    }

    @Override
    public void soundVam() {

        System.out.println("레이싱 카는 경적을 울릴 수 없다");
    }

    @Override
    public void stop() {

        System.out.println("레이싱 카가 멈춥니다");
    }
}
