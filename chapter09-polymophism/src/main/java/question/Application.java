package main.java.question;

import main.java.question.auth.impl.GoogleAuth;
import main.java.question.auth.impl.KakaoAuth;
import main.java.question.auth.impl.NaverAuth;
import main.java.question.dto.MemberDTO;
import main.java.question.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("아이디 입력 : ");
        String id = in.nextLine();
        System.out.println("비밀번호 입력 : ");
        String pw = in.nextLine();

        System.out.println("1. 구굴 2. 네이버 3. 카카오 선택 : ");
        int choice = in.nextInt();
        MemberService memberService;
        boolean result;
        MemberDTO memberDTO = new MemberDTO(id,pw);
        switch (choice) {
            case 1:
                memberService = new MemberService(new GoogleAuth());
                result = memberService.findMember(memberDTO); //구굴로 가서 아이디 비번 입력받고 맞다면 트루 반환
                if (result) {
                    System.out.println("goole로그인에 성공하였습니다. " + memberDTO.getId());
                    return;
                }
                break;
            case 2:
                memberService = new MemberService(new NaverAuth());
                result = memberService.findMember(memberDTO);
                if (result) {
                    System.out.println("naver로그인에 성공하였습니다. " + memberDTO.getId());
                    return;
                }
                break;
            case 3:
                memberService = new MemberService(new KakaoAuth());
                result = memberService.findMember(memberDTO);
                if (result) {
                    System.out.println("kakao 로그인에 성공하였습니다.. " + memberDTO.getId());
                    return;
                }
                break;
            case 9:
                System.out.println("로그인을 종료합니다.");
                return;
        }

    }
}
