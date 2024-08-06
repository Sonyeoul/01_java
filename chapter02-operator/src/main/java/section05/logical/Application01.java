package main.java.section05.logical;

public class Application01 {
    public static void main(String[] args) {


        //논링 연산자의 종류
        //and 와 or
        //and는 a 와 b가 모두 참일때 참을 도출
        //or 는 a 와 b중 하나만 참이여도 참을 도출
        // ! not 논리식의 결과를 반전한다.

        System.out.println("and 참과 참일때"+(true && true));
        System.out.println("and 참과 거짓일때"+(false && true));
        System.out.println("or 참과 참일때"+(true || true));
        System.out.println("or 참과 거짓일때"+(true || false));


        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a<b? && c<b pass? "+((a<b)&&(c<d)));
        System.out.println("a<b? && c>b pass? "+((a<b)&&(c>d)));
        System.out.println("a<b? || c<b pass? "+((a<b)||(c<d)));
        System.out.println("a<b? || c>b pass? "+!((a<b)||(c>d)));
    }
}
