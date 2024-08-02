package main.java.section02.assigment;

public class Application {
    public static void main(String[] args) {


        /*
        *  대입연산자와 산술 복합 대입 연산자
        *  =
        *  +=  ex) a=a+b
        *  -=
        *  /=
        *  *=
        *  %=
        *
        * */

        int num = 12;
        System.out.println("num = " + num);

        num+=3;
        System.out.println("num = " + num);
        num %=5;
        System.out.println("num = " + num);
        num=12;
        
        num *= 4.1;
        System.out.println("num = " + num);
    }
}
