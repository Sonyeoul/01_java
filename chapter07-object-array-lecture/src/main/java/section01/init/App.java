package main.java.section01.init;

public class App {
    public static void main(String[] args) {


        /*
         * 객체배열은 래퍼런스 변수에 대한 배열이다
         * 생성한 인스턴스도 배열을 이용해서 관리하면
         * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고
         * 연속 처리할 수 있어서 유용하다
         * 또한 반환값은 1개의 값만 반환할 수 잇기때문에
         * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우
         * 객체배열을 이용할 수 있다
         * */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 500);


        car1.driveMaxspeed();
        car2.driveMaxspeed();

        Car arr[] = new Car[2];

        arr[0] = new Car("페라리", 300);
        arr[1] = new Car("람보르기니", 500);

        System.out.println("---------------");

        for(int i=0; i<arr.length; i++) {
            arr[i].driveMaxspeed();
        }
        System.out.println("---------------");
        for(Car car : arr) {
            car.driveMaxspeed();
        }
    }
}
