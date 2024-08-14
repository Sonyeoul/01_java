package main.java.understand;

import main.java.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MemberService memberS = new MemberService();


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("어떤걸로 로그인 하시겠습니까");
            System.out.println("1. 구글 2. 카카오 3.네이버 -");
            int num = in.nextInt();
            switch (num) {
                case 1: memberS.login(num); break; //구굴
                case 2: memberS.login(num); break; //카카오
                case 3: memberS.login(num); break; //네이버
                default:
                    System.out.println("잘못된 입력");
                    break;
            }
            return;
        }
    }
}
