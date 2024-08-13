package main.java.section01.user_type;

public class Application01 {
    public static void main(String[] args) {

        //클래스가 무엇인가

        //회원관리

        String id ="user01";
        String pwd = "pass01";
        String name = "홍길동";

        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구","농구","테니스"};


        System.out.println(id);
        System.out.println(pwd);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i]);
        }

        /* 단점
        * 변수명을 다 관리해야함
        * 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면
        * 너무많은 값들을 인자로 전달해야해서 가독성이 떨어짐
        * 리턴값은 1개의 값만 가능하기 때문에 회원 정보를 묶어서 리턴값을 사용할 수 없다
        *
        * 클래스명 변수명 = new 클래스명();
        * 지금까지 사용한 이 구문은 객체를 생성하는 구문이다
        * 사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로
        * heap 영역에 할당을 해야한다
        * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체가 생성
        * 아이디,비밀번호,이름,나이,성별,취미를 연속된
        * 메모리 주소에서 사용하도록 heap에 공간을 만듬
        *  */
        Member member = new Member();

        /*
        * 필드에 접근하기 위해서는 레퍼런스 변수명.필드명() 으로 접근
        * . 은 참조연산자라고 하는데, 래퍼런스 변수가 참조하고 있는
        * 주소로 접근한다는 의미를 가진다. 각 공간은 필드명으로 접근함
        * */
        member.id = "유저";
        member.pwd = "pwd00";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hoppy = new String[]{"축구","농구"};

        System.out.println(id);
        System.out.println(pwd);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i]);
        }

    }
}
