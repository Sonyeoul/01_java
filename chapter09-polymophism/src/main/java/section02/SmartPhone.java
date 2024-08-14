package main.java.section02;

public class SmartPhone extends Product {

    @Override
    public void abstractMethod() {
        System.out.println("product 클래스의 추상메소드 호출");
    }

    public void  printSmartPhone(){
        System.out.println("smartP의 print 메소드 호출");
    }
}
