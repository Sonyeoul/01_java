package main.java.section07.finalkeyword;

public class FinalFieldTest {
    /*
    * final은 중단의 의미를 가지는 키워드
    * final을 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만
    * 결국 변경 불가의 의미이다
    *
    * 1. 지역변수 : 초기화 이후값 변경 불가
    * 2. 매개변수 : 호출시 전달한 인자 변경불가
    * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    * 4.클래스 변수 : 프로그램 시작 이후 값 변경불가
    * 5. non static 메소드 : 메소드 재작성 불가
    * 6. static 메소드 : 메소드 재작성 불가
    * 7. 클래스 : 상속불가
    *
    * final 은 변경 불가의 의미이고
    * 따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가게 되는데
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해주어야하고
    * 그렇지않으면컴파일 에러가 뜬다
    * */

    //선언과 동시에 초기화
    private final int NON_STATIC_NUM = 1;
    //생성자를 이용해 초기화
    private final String NON_STATIC_NAME;
    public FinalFieldTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }
    /*
    * static에도 자바에서 지정한 기본값이 초기에 대입되기 때문에
    * final 키워드 사용시 초기화를 하지않으면 에러발생
    *
    * 생성자를 이용한 초기화는 불가능
    * 생성자는 인스턴스가 생성되는 시점에 호출이 되기 때문에
    * 그 전에는 초기화가 일어나지 못한다
    * 하지만 static은 프로그래임 시작될때 할당되기 때문에
    * 초기화가 되지않은상태로 선언된것과 동일하다
    * 기본값으로 초기화된 후 값을 변경하지 못하기 때문에 에러발생한다.
    *
    * */

}
