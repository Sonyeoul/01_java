package main.java.section03.interfaceimplement;

public class App {

    /*
    * 인터페이스
    * 자바의 클래스와 유사한 형태이지만
    * 추상 메소드와 상수 필드만 가질 수 있는 클래스의 변형체이다
    *
    * 사용목적
    * 1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용
    * 2. 자바의 단일상속 단점을 극복할 수 있다.
    *
    * */


    public static void main(String[] args) {
        InterProduct interProduct = new Product();

        interProduct.abstractMethod();

    }


}
