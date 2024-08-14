package main.java.understand.service;
import main.java.understand.auth.SnsAuth;
import main.java.understand.auth.impl.GoogleAuth;
import main.java.understand.auth.impl.KakaoAuth;
import main.java.understand.auth.impl.NaverAuth;
import main.java.understand.dit.MemberDTO;
import java.util.Scanner;

public class MemberService {

    public void login(int num){
        Scanner in = new Scanner(System.in);
        System.out.println("아이디 입력 : ");
        String id = in.nextLine();
        System.out.println("비밀번호 입력 : ");
        String pw = in.nextLine();
        MemberDTO dto = new MemberDTO(id,pw);
        if(num==1){
            SnsAuth google = new GoogleAuth();
            google.getlogin(dto.setId(id), dto.setId(pw));

        }else if(num==2){
            SnsAuth kakao = new KakaoAuth();
            kakao.getlogin(dto.setId(id), dto.setId(pw));
        } else if (num==3) {
            SnsAuth naver = new NaverAuth();
            naver.getlogin(dto.setId(id), dto.setId(pw));
        }else{
            System.out.println("잘못된 접급");
        }
    }


    public void login1(){
        Scanner in = new Scanner(System.in);

        System.out.println("아이디 입력 : ");
        String id = in.nextLine();
        System.out.println("비밀번호 입력 : ");
        String pw = in.nextLine();
    }
}
