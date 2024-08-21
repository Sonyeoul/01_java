package main.java.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Appl {
    public static void main(String[] args) {
        /*
        * time 패키지는 jdk 1.8에서 추가된 기능이다
        * Date, Calendar 가 가지고 있는 단점을 해소하기 위해 탄생했다
        * time 패키지의 하위 패키지
        *
        * java.time
        *  .chrono : 국제표준에 정의된 달력 시스템을 위한 클래스제공
        *  .format : 날짜와 시간 파싱과 형식에 대한 클래스제공
        *  .temporal : 날짜와 시간 필드와 단위 관련 클래스 제공
        *  .zone : 시간대에 관련된 기능 제공
        *
        *  주로 잘 쓰느 클래스는
        * LocalTime, LocalDate, LocalDateTime, ZonedDateTime 들이 있다
        * */
        LocalTime timenow = LocalTime.now();
        System.out.println(timenow);
        LocalTime timeOf = LocalTime.of(18,30,10);
        System.out.println(timeOf);
        LocalDate datenow = LocalDate.now();
        System.out.println(datenow);
        LocalDate datenow2 = LocalDate.of(2020,1,1);
        System.out.println(datenow2);
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);

    }
}
