package main.java.section2;

public class WildCardFarm {

    //매개변수로 전달 받는 토끼농장을 구현할 때 사용할 타입 변수에 대해 제한할수 있다.

    public  void anyType(RabbitFarm<?>farm){
        farm.getAnimal().cry();
    }
    public void extendsType(RabbitFarm<? extends Bunny>farm){
        farm.getAnimal().cry();
    }
    public void superType(RabbitFarm<? super Bunny>farm){
        farm.getAnimal().cry();
    }
}
