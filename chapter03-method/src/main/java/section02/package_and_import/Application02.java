package main.java.section02.package_and_import;

import main.java.section01.method.Calculater;
import static main.java.section01.method.Calculater.max;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 임포트?
        * 서로 다른 패키지에서 존재하는 클래스를 사용한느 경우 패키지명을 포함한
        * 풀 클래스 이름을 사용해야한다
        * 하지만 매번 다른 클래스이 패키지명까지 기술하기에는 번거롭다
        * 그래서 패키지명을 생략하고 사용 할 수 있도록 한 구문이 import 구문이다
        * import 는 package 선어문과 class 선언문 사이에 작성하며
        * 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다
        * */
        Calculater cal = new Calculater();
        //non static
        int min = cal.min(20,50);
        System.out.println(min);

        int max = max(20,50);
        System.out.println(max);


    }
}
