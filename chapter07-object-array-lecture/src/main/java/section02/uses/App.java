package main.java.section02.uses;

import java.util.Scanner;

public class App {//프로그램 실행부

    public static void main(String[] args) {
        /*
        * 여러명의 회원 정보를 한번에 등록
        * 전체 회원 조회시 여러명의 회원 정보를 한번에 반환
        *
        * MemberRepository - static 필드로 회원 정보들을 저장 MAX 10p
        * */
        Scanner in = new Scanner(System.in);
        MemberService memberService = new MemberService();

        loop:while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택");
            int no = in.nextInt();

            switch (no) {
                case 1: memberService.signUpMembers(); break; //서비스에게 내릴 1번 명령
                case 2: memberService.showAllMembers(); break; //서비스에게 내릴 2번 멍령
                case 9:
                    System.out.println("프로그램 종료"); break loop;
                default:
                    System.out.println("잘못된 번호입니다");
            }
        }


    }
}
