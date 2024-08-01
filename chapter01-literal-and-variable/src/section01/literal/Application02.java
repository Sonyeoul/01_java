package section01.literal;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        int a=10;
        int b=20;


        System.out.println(a+b);
        System.out.println(b/a);
        System.out.println(a*b);
        System.out.println(b-a);
        System.out.println(a % b);
        System.out.println("-------------");
        System.out.println(1+0.5);
        System.out.println(1-0.5);
        System.out.println(1*0.5);
        System.out.println(1/0.5);
        System.out.println(1%0.5);

        System.out.println('a'+'b');
        System.out.println('1'+'3');

        //데이터 값이 서로 다를때는 자동 형변환을 통해 최상위 타입으로 변경된다.
        System.out.println(+123+1+"야미띠"+252+"12"+true);
        //논리값 연산
        // 논리랑 문자열만 가능
        System.out.println(true+"real");




    }
}
