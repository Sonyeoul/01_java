package main.java.section03.math;

import java.util.Random;

public class Application01 {
    public static void main(String[] args) {


        /*
        * API
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스
        * 구현하기 힘들거나 어려운 기능을 JDK 설치하면 사용할 수 있도록 제공한 소스코드를 의미

        * Math 클래스는 수학에서 자주 사용되는 상수들과 함수들을 미리 구현해놓은 클래스이다
        * 모든 메소드는 static 메소드로 정의되어있다.
        * */

        System.out.println("-7의 절대값 :"+(Math.abs(-7)));

        System.out.println("10 과 11중 더 작은것은"+(Math.min(10,11)));
        System.out.println("10 과 11중 더 큰것은"+(Math.max(10,11)));

        var ram =(int)(Math.random()*11);
        System.out.println(ram);

        Random r = new Random();
        int a = r.nextInt(10);
        System.out.println(a);
        //-127~128
        int b = r.nextInt(256)-128;
        System.out.println(b);
    }
}
