package main.java.section04.wrapper;

public class App {
    public static void main(String[] args) {
        /*
        * 상황에 따라 기본타입의 데이터를인스턴스화 해야 하는 경우들이 발생함
        * 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야하는데
        * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할수 있도록 하는 클래스를 래퍼클래스
        * 라고한다.
        *
        * 기본 타입 래퍼클래스
        * byte      Byte
        * short     Short
        * int       Integer
        * long      Long
        * float     Float
        * double    Double
        * char      Character
        * boolean   Boolean
        *
        *
        * 박싱 언박싱
        * 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는것 - 박싱
        * 래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는것 - 언박싱
        * */
        int intValue = 20;
        Integer boxingnum1 = new Integer(intValue);
        Integer boxinnum2 = Integer.valueOf(intValue);

        int inum =20;
        Integer inum1 = new Integer(20);
        Integer inum2 = new Integer(20);
       Integer inum3 = 20;
       Integer inum4 = 20;

        System.out.println(inum ==inum1);
        System.out.println(inum ==inum3);

        //생성자를 이용해 생성한 인스턴스인 경우 ==비교하지못함
        // 오토 박싱은 가능하다
    }
}
