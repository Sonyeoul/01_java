package section02.variable;

import java.nio.file.Path;
import java.sql.SQLOutput;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 변수의 사용 목적에 대하여 이해할 수 있다.
        *
        * 변수의 사용 목적
        * 1. 값의 의미를 부여하기 위한 - 의도가 쉽게 파악되어야한다
        * 2. 한 번에 저장해 둔 값을 재사용하기 위한 목적
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
        *
        * */
        System.out.println("저번달 보너스를 포함한 급여:"+(100+20)+"만원");
        System.out.println("이번달 보너스를 제외한 급여:"+100+"만원");

        int salary = 200;
        int bonus = 50;
        System.out.println("저번달 보너스를 포함한 급여:"+(salary+bonus)+"만원");
        System.out.println("이번달 보너스를 제외한 급여"+salary+"만원");

        String name = "아무개";
        int point = 100;

        System.out.println(name+"은 쇼핑중독이다\n 지난달"+name + "의 쇼핑몰 포인트는"+point +"이였다");
        point += 100;
        System.out.println("이번달"+name+"의 포인트는"+point+"이다");
        //&#xC544;&#xBB34;&#xAC70;&#xB098; &#xC218;&#xC815;&#xD574;&#xC11C; commit retry
    }
}
