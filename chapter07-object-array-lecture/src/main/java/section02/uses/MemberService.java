package main.java.section02.uses;

public class MemberService { //App의 명령을 실행해서 반환할곳
    
    public void signUpMembers(){
        Member[] members = new Member[5];
        
        members[0] = new Member(1,"user01","pass01","노양심",25,'남');
        members[1] = new Member(2,"user02","pass02","윤석열",41,'여');
        members[2] = new Member(3,"user03","pass03","이재명",54,'남');
        members[3] = new Member(4,"user04","pass04","허경영",30,'여');
        members[4] = new Member(5,"user05","pass05","레츠고",99,'올');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);

    }


    public void showAllMembers(){
        
        MemberFinder memberFinder = new MemberFinder();

        System.out.println("--가입된 회원 목록--");
        for(Member member: memberFinder.findAllMember()){
            if(member != null){
                System.out.println(member);
            }
        }
        System.out.println("회원 조회 완료");
    }
}
