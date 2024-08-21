package main.java.question.auth.impl;

import main.java.question.auth.SnsAuth;
import main.java.question.dto.MemberDTO;

public class NaverAuth implements SnsAuth {
    public void login(String id,String pwd){;
        MemberDTO dto = new MemberDTO(id, pwd);
        String idAgree="son";
        String passwordAgree="son1006";
        if((dto.getId()).equals(idAgree) && (dto.getPwd()).equals(passwordAgree)){
            System.out.println("네이버에 인증된"+id+"님 환영합니다");

        }else{
            System.out.println("네이버에 인증된 회원이 없습니다");
        }
    }
}
