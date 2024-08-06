package main.java.section01.method;

public class Application07 {
    public static void main(String[] args) {
        /*
        * static 메소드 호출
        *
        * static 메소드를 호출하는 방법
        * 클래스명.메소드명();
        *
        * */
        int a= Application07.num(1,2);
        System.out.println(a);
        System.out.println(num(3,4 ));

    }
    public static int num(int num1, int num2) {
        return num1 + num2;
    }
}
