package main.java.section02.understand;

import main.java.section02.understand.car.Car;
import main.java.section02.understand.car.ElectricCar;
import main.java.section02.understand.car.Oldcar;
import main.java.section02.understand.empolyee.Seller;

public class App {

    public static void main(String[] args) {

        System.out.println("자동차 판매 프로그램");
        System.out.println("전기차");
        ElectricCar ionic1 = new ElectricCar("H",2000,"아이오닉1","1000V");
        ElectricCar ionic2 = new ElectricCar("H",2500,"아이오닉2","1500V");
        ElectricCar ionic3 = new ElectricCar("H",3000,"아이오닉3","2000V");
        ElectricCar kona = new ElectricCar("H",2000,"kona","1100V");
        System.out.println("내연기관 자동차");

        Oldcar porter = new Oldcar("H",1500,"포터","휘발류");
        Oldcar avanta = new Oldcar("H",1500,"아반떼","경유");
        Oldcar sonata = new Oldcar("H",2000,"소나타","경유");

        System.out.println("영업사원 입사 ");

        Seller seller = new Seller("김사원");

        Car[] cars = {porter,kona,ionic2,avanta};
        seller.sale(cars);
        System.out.println("결산 : "+seller);


    }

}
