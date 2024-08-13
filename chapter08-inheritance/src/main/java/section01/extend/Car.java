package main.java.section01.extend;

public class Car {
    private boolean running;

    Dwss dd = new Dwss();

    public Car() {
        System.out.println("Car 클래스의 기본생성자 호출");
    }
    
    public void run(){
        running = true;
    }
    
    public boolean isRunning() {
        return running;
    }
    public void soundVam(){
        if(isRunning()){
            System.out.println("배앰");
        }else{
            System.out.println("주행중이 아니라 경적을 울리지 않습니다");
        }
    }
    public void stop(){
        running = false;
        System.out.println("차가 멈춥니다");
    }
    
}
