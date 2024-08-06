 package main.java.section01.method;

public class Application03 {
    public static void main(String[] args) {

        /*
         * 전달인자 args 매개변수 parameter
         *
         * 변수의 종류
         *
         * 1. 지역변수 메소드 내에 존재함
         * 2. 매개변수 일종의 지역 변수 - 메소드 내부에서 사용가능
         * 3, 전역변수 클래스안에서 사용 가능
         * 4. 클래스 변수
         *
         * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우
         * 메소드 호출시 사용하는 괄호를 이용해서 값을 전달가능
         * 전달하는 값을 전달인자, 전달 인자를 받기 위해 선언하는 변수를 매개변수 라고한다.
         *
         * */
        Application03 app3 = new Application03();
        app3.test(20);
        int age = 28;
        app3.test(age);

        byte     byteAge = 29;
        app3.test(byteAge);

        long longage = 31l;
        app3.test((int)longage);

        app3.test(byteAge*30);





    }

    public void test(int age){
        System.out.println("나이는 "+age+"살 이다");


    }

}
