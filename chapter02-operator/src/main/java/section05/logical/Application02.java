package main.java.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        //논리 연산자 우선순위는 and >> or

        int a= 50;

        System.out.println(1<=a && 100>=a);


        char n = 'y';
        char y = 'Y';


        System.out.println();
        System.out.println((n>='a'&&n<='z')||(y>='A'&&y<='Z'));
        System.out.println((n>=97&&n<=122)||(n>=65&&n<=90));

    }
}
