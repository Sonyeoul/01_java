package main.java.section05.calendar;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        /*
        * Date 클래스
        * jdk 1.0 부터 날자를 취급하기 위해 사용되던 date 클래스는
        * 생성자를 비롯하여 대부분의 메소드가 Deprecated 되었다
        * 사라질 위험이 있는 것이니  사용을 권장하진 않겠다라는 뜻
        *
        * jdk 1.1 부터는 claendar 클래스를 이용하여 날짜와 시간을 처리했다
        * 하지만 calendar 클래스는 몇가지 문제를 가지고 있다
        * 1.Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수있다
        * 2. 윤초를 고려하지않는다
        * 3. Calendar 클래스는 월을 0부터 11까지 표현하는 불편함이 있다.
        *
        * */
        Date today = new Date();
        System.out.println(today.getTime());

        Date time = new Date(1723786165717L);
        System.out.println(time);
    }
}
