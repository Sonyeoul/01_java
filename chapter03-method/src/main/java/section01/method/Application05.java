package main.java.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /*
        * 메소드 내부에는 return이 존재한다.
        * void 같은 경우 return을 명시적으로 작성하지 않아도
        * 마지막줄에 컴파일러가 자동을 ㅗ추가해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어다.
        *
        * */
        Application05 app = new Application05();
        System.out.println("main() 메소드 시작함..");
        app.test();


    }
    public void test(){
        System.out.println("테스트 메서드 동작확인");
    }
}
