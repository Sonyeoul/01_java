package main.java.section03.abstraction;

public class Car {

     private boolean isOn;
     private int speed;


     public void start(boolean isOn) {
         if(isOn) {
             System.out.println("이미 시동이 걸려 있음");
         }else{
             this.isOn = true;
             System.out.println("시동이 걸렸습니다");
         }
     }
     public void go(int speed) {
         if(isOn){
             if(speed==0) {
                 System.out.println("자동차가 출발합니다");
             }
             speed += 10;
             System.out.println("자동차의 현재 시속은"+speed+"입니다");
         }else {
             System.out.println("시동을 걸어야 출발 가능합니다");
         }
     }

     public void stop() {
         if(isOn) {
             if(this.speed>0){
                 while(this.speed>0){
                     --this.speed;
                     System.out.println("현재 속도는"+this.speed+"km");
                 }
                 System.out.println("자동차가 멈췄습니다");
             }else
                 System.out.println("이미 멈춰있는 상태입니다");
         }else{
             System.out.println("시동이 걸리지않은경우 유압으로 인해 브레이크가 무거워 집니다");
         }
     }
     public void turnOff(){
         if(isOn){
             if(this.speed >0){
                 System.out.println("달리는 상태에서는 끄는것은 위험합니다");
             }else {
                 this.isOn = false;
                 System.out.println("시동을 끄겠습니다");
             }
         }else{
             System.out.println("시동이 이미 꺼져있습니다");
         }
     }

}
