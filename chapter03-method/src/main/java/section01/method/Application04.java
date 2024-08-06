package main.java.section01.method;

public class Application04 {
    public static void main(String[] args) {
        //여러개의 전달 인자를 이용한 메소드 호츌

        Application04 app4 = new Application04();
        app4.sest1("홍길동",20,'남');

    }

    // 문서화 주석 - 메소드를 호출할때 우리가 작성한대로 가이드 가능
    // 가이드를 보고 만든 메소드를 어떻게 사용하는지 알 수 있다.
    /**
     *이름과 나이와 설병을 전달 받아 한번에 출력해주는 기능을 제공
     * @param name 출력할 이름을 전달 해주세요
     * @param  age 출력할 나이를 전달 해주세요
     * @param  gender 출력할 성별을 전달 해주세요 성별은 변경 불가능*/
    public void sest1(String name, int age,final char gender){
        System.out.println("이름 :"+name+" 나이 :"+age+" 성별 :"+gender);

    }

}
