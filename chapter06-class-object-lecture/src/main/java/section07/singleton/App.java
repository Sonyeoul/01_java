package main.java.section07.singleton;

public class App {
    public static void main(String[] args) {
        /*
        * singleton pattern
        * 애플리케이션이 시작될때 어떤 클래스가 최초 한번만
        * 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
        * 하나의 인스턴스를 공유해서 사용하며
        * 메모리 낭비를 방지할 수 있게 함.
        *
        * 장점
        * 1.첫번째 이용시에는 인스턴스를 생성해야하므로 속도차이가 나지않지만
        * 두번째 이용시에는 인스턴스 생성 시간없이 사용할수있다
        * 2. 인스턴스가 절대적으로 한개만 존재하는것을 보장할수있다
        *
        * 단점
        * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다
        * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다
        *
        *  싱글톤 구현
        * 1. 이른 초기화
        * 2. 게으른 초기화
        *
        *  */
        //EagerSingleton earger = new EagerSingleton();
        EagerSingleton eager1 = EagerSingleton.getInstance();
        
        //게으른 초기화
        LazySingleton lazy1 = LazySingleton.getInstance();

        System.out.println("lazy1 = " + lazy1);

        /*
        * static
        * 정적 메모리 영역에 프로그램이 시작될때 할당하는 키워드
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버에 지정할 수있다
        * 여러 인스턴스가 공유해서 사용할 목적의 공간
        * 하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다
        * 명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하는게 좋다
        * 의도적으로 static 키워드를 사용하는 대표적인 예는 singleton이다
        *
        * */


    }
}
