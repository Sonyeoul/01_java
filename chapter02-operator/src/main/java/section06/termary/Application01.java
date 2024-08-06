package main.java.section06.termary;

public class Application01 {
    public static void main(String[] args) {

        //삼항연산자 (논리조건식)? a:b
        //조건식이 참이라면 a 거짓이라면 b를 반환한다.

        int a = 10;
        int b = -1;

        String result = (a>0) ? "양수":"음수";
        String result1 = (b>0) ? "양수":"음수";

        System.out.println("a는"+result);
        System.out.println("b는"+result1);

        int num1=5;
        int num2=10;
        int num3=-20;

        String result3 = (num1>0) ? "양수": (num1==0) ? "0이다":"음수";
        String result4 = (num2>0) ? "양수": (num2==0) ? "0이다":"음수";
        String result5 = (num3>0) ? "양수": (num3==0) ? "0이다":"음수";

        System.out.println(""+result3+result4+result5);


    }
}
