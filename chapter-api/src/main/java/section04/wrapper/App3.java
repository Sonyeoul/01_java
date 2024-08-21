package main.java.section04.wrapper;

public class App3 {
    public static void main(String[] args) {
        //기본 자료형 값을 문자열로 변경할 수 있다

        /*
        * valueOf() : 기본자료형 값을 Wrapper 클래스로 변환시키는 메소드
        * toString() : 문자열로 반환하는 메소드
        *
        * */

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(3).toString();
        String j = Long.valueOf(4).toString();
        String k = Float.valueOf(5).toString();
        String l = Double.valueOf(6).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('A').toString();
    }
}
