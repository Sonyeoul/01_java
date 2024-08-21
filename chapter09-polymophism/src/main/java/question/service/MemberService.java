package main.java.question.service;

import main.java.question.auth.SnsAuth;
import main.java.question.auth.impl.GoogleAuth;
import main.java.question.auth.impl.KakaoAuth;
import main.java.question.auth.impl.NaverAuth;
import main.java.question.dto.MemberDTO;

public class MemberService {

    SnsAuth snsAuth;
    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public boolean findMember(MemberDTO memberDTO){
        snsAuth.login(memberDTO.getId(), memberDTO.getPwd());
        return false;
    }
}