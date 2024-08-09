package main.java.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void test(){
        Scanner input = new Scanner(System.in);

        System.out.println("정수입력 :");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수");
        }
        System.out.println("프로그램 종료");
    }
}


    /*
    * if
    * 조건식안에 참이면 {}안에 있는 코드를 실행하고 거짓이면 {}안에 있는 코드를 무시하고 넘어감
    *
    * */
