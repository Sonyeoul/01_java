package main.java.section03.interfaceimplement;

public class Product extends Object implements InterProduct {

    /*
    * 클래스에서 인터페이스를 상속받을 떄에는 implements 키워드 사용해야함
    * 또한 인터페이스는 여러 개를 상속 받을 수 있으며
    * extends 로 다른 클래스를 상속 받는 경우에도 그것과 별개로
    * 추가 상속이 가능해진다 단 extends를 앞에 작성하고
    * 뒤에 implement 작성
    * */

    @Override
    public void abstractMethod() {

    }
}
