package main.java.understand.auth.impl;

import main.java.understand.auth.SnsAuth;
import main.java.understand.dit.MemberDTO;

public class NaverAuth implements SnsAuth {
    @Override
    public void getlogin(String id, String password) {

        MemberDTO dto = new MemberDTO(id, password);
        String idAgree="son2";
        String passwordAgree="son1006";
        if((dto.getId()).equals(idAgree) && (dto.getPwd()).equals(passwordAgree)){
            System.out.println("네이버에 인증된"+id+"님 환영합니다");
        }else{
            System.out.println("네이버에 인증된 회원이 없습니다");
        }
    }
}