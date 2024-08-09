package main.java.section01.conditional.question;

import java.util.Scanner;

public class Question03 {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        boolean isTrue = true;
        System.out.println("음료 선택해주세요 (사이다,콜라,환타,솔의눈)");
        String drink = scn.nextLine();
        int price = 0;
        String drink1 = "음료를 더 선택해주세요(사이다,콜라,환타,솔의눈)";

        while (isTrue) {

            switch (drink) {
                case "사이다":

                    price += 1000 ;
                    break;
                case "콜라":

                    price += 1500;
                    break;
                case "환타":

                    price += 1700;
                    break;
                case "솔의눈":

                    price += 1900;
                    break;
                default:
                    System.out.println("입력 오류");
                    break;
            }
            System.out.println(drink + "를 선택하셨습니다");
            System.out.println("계산을 하십니까?");
            String awr = scn.nextLine();
            if (awr.equals("네")) {
                System.out.println("가격은" + price + "입니다");
                isTrue = false;
            }else if(awr.equals("아니요")) {
                System.out.println(drink1);
            }
            drink = scn.nextLine();
        }
    }
}