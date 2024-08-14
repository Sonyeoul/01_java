package main.java.section03.interfaceimplement;

import java.io.Serializable;

public interface InterProduct extends Serializable {

    /*
    * 인터페이스는 상수 필드만 작성 가능하다
    * public static final 제어자 조합을 상수 필드라고 한다.
    * 하지만 선언과 동시에 초기화 해 주어야 한다.
    *
    * */

    public static final int MAX_NUM = 10;
    int MIN_NUM=5;
    //인터페이스는 생성자를 가질수없다

    /*
    * 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가짐
    * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우
    * 반드시 접근 제어자를 public 으로 해야 가능하다.
    * */
    static void staticMethod() {
        System.out.println(" interface클래스의 staticMethod 호출");
    }
    void abstractMethod();


}
