package main.java.section03.dto;

public class Application {
    public static void main(String[] args) {
        /*
        * 캡슐화의 원칙에는 일부 어긋나긴 하지만 다른 목적을 가진
        * 클래스와 객체를 추상화 하는 기법이 있다
        * 행위 위주가 이닌 데이터를 하나로 뭉치기 위한 객체
        * Data Transfer Object
        * 이러한 객체를 설계할때는 행위가 아닌 데이터가 위주이며
        * 캡슐화 원칙을 준수하여 모든 필드를 private로 직접 접근을 막고
        * 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다
        * 어떤것을 쓸지 모르니 미리 다 준비해두는 종합선물세트같은 개념이다
        * private필드와 필드값을 수정하는 서정자
        * 필드에 접근하는 접근자들로 구성된다
        * 주로 계층간 데이터를 주고받을 목적으로 사용한다.
        *
        * */
        MemberDTO member = new MemberDTO();
        member.setName("홍홍홍");
        member.setAge(20);

        System.out.println("이름 나이  "+member.getName()+member.getAge());
        System.out.println(member.getNum());
    }
}
