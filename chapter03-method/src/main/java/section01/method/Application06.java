package main.java.section01.method;

public class Application06 {
    public static void main(String[] args) {

        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return; 명령어가 존재한다
        * return 은 자신을 호출한 구문으로 복귀하는 것
        * 값을 가지고 복귀할수도있고 아닐수도 있다
        *
        * return 값을 반환하기 위해서는 메소드 선언부에 리턴타입을 명시 해 주어야한다 void는 아무 반환값을 가지지않겠다는
        * 리턴값에 사용 가능한 키워드디
        *
        * 반환값이 없는 경우 return을 생략ㅐ도 컴파일러가 자동으로 추가하지만
        * 반환값이 있는 경우 return 구문을 반드시 작성해야함
        * 선언부에 리턴타입과 반환값의 자료형은 반드시 일치해야한다.
        * */
        Application06 a = new Application06();
        String reV = a.test();
        System.out.println(reV);


    }

    public String test(){
        return "hello fucking world";
    }
}
