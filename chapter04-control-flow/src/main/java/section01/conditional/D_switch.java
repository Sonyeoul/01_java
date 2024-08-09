package main.java.section01.conditional;

import java.util.Scanner;

public class D_switch {



    public void testSwitch(){

        //switch문
        //default case 모두에 해당하지않은 경우 실행
    Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수입력");
        int a = sc.nextInt();
        System.out.println("두번째 정수 입력");
        int b = sc.nextInt();
        System.out.println("연산할 기호 입력");
        char c = sc.next().charAt(0);
        int result = 0;
        switch (c){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            case'%':
                result = a%b;
                break;
            default:
                System.out.println("입력 오류");
                break;
        }
        System.out.println("결과값 : "+result);
    }
    public void vending(){

        Scanner sc = new Scanner(System.in);
        System.out.println("사이다(500) 콜라(600) 환타(700) 박카스(1000)");
        System.out.println("음료선택");

        String drink = sc.nextLine();
        int price = 0;

        switch (drink){
            case"사이다": price = 500; break;
            case"콜라": price = 600; break;
            case"환타": price = 700; break;
            case"박카스": price = 1000; break;
            default:
                System.out.println("잘못입력함");  break;
        }
        System.out.println(drink+"선택했습니다");
        System.out.println(price+"원 입니다");
    }
}
