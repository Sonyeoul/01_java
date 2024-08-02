package main.java.section01.arithmetic;

public class Arithmetic {
    public static void main(String[] args) {
        /*
        * 산술연산자
        * 연산 방향은 왼쪽에서 오른쪽
        * 두 개인 이항 연산자로 분류
        *  + - * / % 우선순위 동일
        *
        */

        int num1 = 10;
        int num2 = 5;

        System.out.println("num1 + num2= " + (num1+num2));
        System.out.println("num1 - num2= " + (num1-num2));
        System.out.println("num1 * num2= " + num1*num2);
        System.out.println("num1 / num2= " + num1/num2);
        System.out.println("num1 % num2= " + num1%num2);


    }
}
