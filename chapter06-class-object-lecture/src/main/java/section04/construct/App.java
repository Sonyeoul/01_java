package main.java.section04.construct;

public class App {
    public static void main(String[] args) {

        // 클래스명 변수명 = new 클래스명(); < 생성자
        /*
        * 생성자
        * 인스턴스를 생성할땨 초기 수행할 명령이 있는 경우 미리 작성하고
        * 인스턴스를 생성할 때 호출된다. 생성자 함수에 매개변수가 없는 생성자를
        * 기본 생성자 라고하며 기본생성자는 컴파일러에 의해 자동으로 추가되기 때문에
        * 지금까지 명시적으로 작성하지 않은 것이다.
        * 아무것도 작성하지 않은 것이다.
        *
        * */
        User user = new User("user","sonyeul");
        System.out.println(user.getClass());


    }
}
