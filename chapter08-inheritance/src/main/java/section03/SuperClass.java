package main.java.section03;

public class SuperClass {
    /*
    * 오버라이딩
    * 부모 클래스에서 상속받은 메소드를 자식 클래스에서 재정의 하여 사용하는것
    * 
    * 오버라이딩 성립요건
    * 1. 메소드의 이름이 동일해야한다
    * 2. 메소드의 리턴 타입이 동일해야한다
    * 3. 매개변수 타입,갯수,순서가 동일해야함
    * 4. private 매소드는 접근이 불가능하기 때문에 오버라이딩 불가
    * 5. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야한다
    * 6. final 키워드가 사용된 메소드는 불가능하다
    * 7. 예외 처리는 같은 예외이거나 더 구체적인 예외를 처리해야하 한다
    * 
    * */
    public void method(int num){}

    private void priv(){
    }
    private final void priv2(){}
}
