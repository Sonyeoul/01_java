package main.java.section01.extend;

public class FireCar extends Car {

    public FireCar() {
        super();
    }



    public void ss(){

    }

    @Override
    public void soundVam() {
        super.soundVam();
        if (isRunning()) {
            System.out.println("VVVVVV");
        } else {
            System.out.println("차량이 멈춰있습니다");
        }
    }
    public void water(){
        System.out.println("물대포오오");
    }
}
