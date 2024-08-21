package main.java.section01.exception;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        * 예외처리
        * 자바 프로그램 작성 시 자바 문법에 맞지않는경우
        * 코드를 컴파일하려고 할때 컴파일 에러를 발생시킴
        * 엄밀히 말하자면 문법상의 오류이다
        * 혹은 자바 문법에 맞게 작성하여 컴파일에 문젝 ㅏ없더라도
        * 실행되면서 예상치 못하게 오류가 발생할 수 있다
        * 컴퓨터가 프로그램이 동작하는 도중에 예상치 못한 사태가 발생하여
        * 실행중인 프로그램이 영향을 받는것을
        * 오류와 예외 두가지로 구분 가능하다
        *
        * 오류
        * : 시스템 상에서 심각한 문제가 발생하여 실행중인 프로그래임이 종료되는것
        * 개발자가 미리 예측하는것이 불가능 하며 처리할 수 없다
        *
        * 예외
        * : 오류와 마찬가지로 비정상적으로 종료 시키지만
        * 발생할수 있는 상황을 예측하고 처리할 수 있는 미약한 오류를 의미함
        * */
        ExceoptionTest ex = new ExceoptionTest();
        ex.checkMoney(10000,30000);
        ex.checkMoney(30000,10000);
        System.out.println("프로그램 종료");

    }
}
