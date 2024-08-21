package main.java.section03.stringbuilder;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 두 클래스는 스레드동기화 기능 제공 여부에 따라 차이점이 있다
        * StringBuilder 스레드 동기화 기능 제공하지않음
        * 스레드 동기화 처리를 고려하지 않는 상황에서 stringbuffer 보다 성능이 좋음
        * stringbuffer 스레드 동기화 기능 제공함
        * 성능면에서는 string builder 보다 느림
        * 두 개의 차이는 스레드 동기화 유무일뿐이고 우리는 스레드를
        * 고려하지 않기 때문에 string bulider를 이용할 것이다
        *
        * String - 불변이라는 특징
        * 물자열에 + 연산으로합치는 경우 기존 인스턴스를 수정하는것이 아닌새로운 인스턴스 반환
        * 문자열 변경이 자주 일어나느경우 성능면에서 좋지않음
        * 하지만 변하지 않는 문자열을 자주 읽어 들이는 경우 오히려 좋은 성능 기대가능
        * StringBuilder : 가변이라는 특징
        * 문자열에 append() 메소드를 이용하여 합치기 하는경우]
        * 기존 인스턴스를 수정하기 때문에  새로운 인스턴스를 생성하지 않는다
        * 따라서 잦은 문자열 변경이 일어나는 경우에는 String 보다 성능이 좋음
        * */
    }
}
