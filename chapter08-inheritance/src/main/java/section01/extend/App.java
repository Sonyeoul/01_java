package main.java.section01.extend;

public class App {
    public static void main(String[] args) {
        /*
        * 상속은 현실 세계의 상속과 비슷한 개념이다
        * 부모가 가지고 있는 재산을 자식이 물려받는 의미
        * 클래스 또한 부모 클래스와 자식 클래스로 역할을 나누어서 부모가 가지는
        * 멤버를 자식이 몰려 받아 자기의 멤버인것 처럼 사용할수있도록 만든기술이다
        *
        * 하지만 단순 물려받는 개념보다는 조금 더 나아가서
        * 자바에서 상속은 부모클래스의 확장의 개념을 가진다
        * 물려받아 자신의 것 처럼 사용하는 것 뿐만 아니라
        * 추가적인 멤버도 작성이 가능하다
        * 특히 메소드 재정의 라는 기술을 이용햐서
        * 부모가 가진 메소드를 재정의 하는것도 가능하다
        *
        * 상속이라는 기술을 사용하게 되면 얻게 되는 이점
        * 1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용할 수 있다
        *  1-1. 재사용시 생산성을 크게 항샹시킬수 있다
        *  1-2. 공통적으로 사용하는 코드가 부모 클래스에서만 존재하면 수정사항이 생길시
        * 부모만 수정해도 전체적으로 적용된다
        * 2. 클래스 간의 계층 관계가 형성되며 다형성 문법적인 토대가 된다
        *
        * 단점
        * 1. 부모 클래스의 기능을 추가/변경할 시 자식 클래스가 정상적으로 동작하는지 예측ㅇ ㅣ힘듬
        * 상속 구조가 복잡해 질수록 그 영향에 대한 예측이 힘들어 이러한 단점이 유지보수성이 증가하는 장점과는 반대로
        * 유지보수에 악영향을 끼친다.
        * 2. 또한 부모클래스의 변경도 쉽지 않다. 자식 클래스에서 중요하게 사용하는 기능인 경우
        * 부모 클래스를변경할 시 자식 클래스에 모두 영향을 줄 수 있다
        * 역시 유지보수성에 악영향을 미친다
        * 3. 부모 클래스에서는 의미 있엇던 기능이 자식 클래스에서는 무의미 할수있다
        *
        * 장단점을 고려했을때
        * 상속은 재사용이라는 장점만 바라보게 되면 오용 가능성이 있기 때문에
        * 유지보수에 안좋은 코드를 작성할 확률이 높다
        * 상속은 is a 관꼐로 구분이 되는 경우에만 사용해야한다
        *
        * */
        Car car =new Car();

        car.soundVam();
        car.run();
        car.soundVam();
        car.stop();
        car.run();

        FireCar car2 =new FireCar();
        car2.toString();
        car2.run();
        car2.soundVam();
        car2.water();

        Car test = car2;

        FireCar test2 = car2;
        test.run();
        test.soundVam();

        test2.water();

        System.out.println("레이싱 카 테스트");
        RacingCar race = new RacingCar();
        race.run();
        race.soundVam();
        race.stop();
    }
}