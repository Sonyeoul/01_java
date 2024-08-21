package main.java.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App2 {
    public static void main(String[] args) {

        /*
        * calendar 클래스는 abstract 클래스로 작성되어있음
        * 따라서 calendar 클래스를 이용해서 인스턴스를 생성하는것이 불가
        *
        * calendar 클래스를 이용한 인스턴스 생성 방법에는 두가지가 있다
        * 1.getInstance() static 메소드를 이용한 방법
        * 2. 후손 클래스인
        * gregorianCalendar 클래스 이용해서 인스턴스를 생성하는 방법
        * */

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        //특정 날짜 시간정보를 이용해서 인스턴스를 생성하는 방법을
        //GregorianCalendar 의 생성자로 제공한다
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);
        //년 월 일 시 분 초 정보를 이용해 인스턴스 생성
        //2024.8.16 14:37:00

        int year = 2024;
        int month = 7;
        int dayOfmonth = 16;
        int hour = 14;
        int min = 37;
        int second = 0;

        Calendar today = new GregorianCalendar(year, month, dayOfmonth, hour, min);


        System.out.println(today.getTimeInMillis());

        /* 필기. 출력된 정수로 Date 인스턴스를 생성하면 해당 날짜/시간 정보를 가지는 Date 인스턴스가 된다. */
        Date date = new Date(today.getTimeInMillis());

        System.out.println("date = " +date);

        /* 필기. 실제 사용 시 이런 형태로 사용 되는 경우가 많다. */
        Date date2 = new Date(new GregorianCalendar(year, month, dayOfmonth, hour, min, second).getTimeInMillis());

        System.out.println("date2 = " +date2);

        /* 필기. 생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 사용하여 반환받을 수 있다. */
        int birthYear = today.get(1);  // 인덱스
        int birthMonth = today.get(2);
        int birthDayOfMonth = today.get(5);

        System.out.println(birthYear);
        System.out.println(birthMonth);         //8이 9월을 의미한다.
        System.out.println(birthDayOfMonth);

        /* 필기.
         *  인자로 전달하는 정수에 따라 필드 값을 반환받을 수 있다.
         *  하지만 이렇게 사용하게 되면 각 필드에 매칭되는 매개변수의 위치 정수를 다 외워야 사용이 가능해진다.
         *  따라서 저러한 정수를 상수 필드 형태로 제공하고 있다.
         * */
        System.out.println("Calendar.YEAR" +Calendar.YEAR);            //1
        System.out.println(Calendar.MONTH);         //2
        System.out.println(Calendar.DATE);            //5

        /* 필기.
         *  그러면 우리는 get()메소드의 인자로 정수 대신 상수 필드값을 호출하는 식으로 코드를 개선하면
         *  보다 의미 전달이 쉬운 코드가 된다.
         * */
        System.out.println("year : " + today.get(Calendar.YEAR));
        System.out.println("month : " + today.get(Calendar.MONTH));         //0 ~ 11월
        System.out.println("dayOfMonth : " + today.get(Calendar.DATE));
        /* 설명. 요일(일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7) 의 의미이다.  */
        System.out.println("dayOfWeek : " + today.get(Calendar.DAY_OF_WEEK));

        String day = "";
        switch(today.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY : day = "일"; break;
            case Calendar.MONDAY : day = "월"; break;
            case Calendar.WEDNESDAY : day = "화"; break;
            case Calendar.TUESDAY : day = "수"; break;
            case Calendar.THURSDAY : day = "목"; break;
            case Calendar.FRIDAY : day = "금"; break;
            case Calendar.SATURDAY : day = "토"; break;
        }
        System.out.println("요일 : " + day);

        System.out.println("amPm : " + today.get(Calendar.AM_PM));            //0은 오전 1은 오후

        System.out.println(today.get(Calendar.AM_PM) == Calendar.AM? "오전": "오후");

        System.out.println("hourOfDay : " + today.get(Calendar.HOUR_OF_DAY));   //24시간 체계
        System.out.println("hour : " + today.get(Calendar.HOUR));            //12시간 체계

        System.out.println("min : " + today.get(Calendar.MINUTE));
        System.out.println("second : " + today.get(Calendar.SECOND));

    }
}
