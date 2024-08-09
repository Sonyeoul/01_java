package main.java.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void test1(){
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
    public void test2(){
        // 중첩 elseif 문
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num==0){
            System.out.println("0입니다");
        }else if(num % 2==0){
            System.out.println("입력한 값은 양수");
        }else{
            System.out.println("입력한 값은 홀수");
        }

    }
}
