package main.java.section2.run;

import main.java.section2.*;

public class App {
    public static void main(String[] args) {
        /*
        * 제네릭 클래스 작성시 extends 키워드를 사용하면 특정 타입만 사용하고 제한을 걸수있다
        *
        * */

//        RabbitFarm<Animal> Farm = new RabbitFarm<Animal>();
        RabbitFarm<Rabvit> farm = new RabbitFarm<>();
        RabbitFarm<Bunny> farm1 = new RabbitFarm<>();
        RabbitFarm<DrunkeBunny> farm2 = new RabbitFarm<>();

        farm.setAnimal(new Rabvit());
        farm.getAnimal().cry();

        farm1.setAnimal(new Bunny());
        farm1.getAnimal().cry();
    }
}
