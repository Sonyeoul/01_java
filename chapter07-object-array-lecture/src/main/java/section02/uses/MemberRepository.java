package main.java.section02.uses;

public class MemberRepository { // 데이터베이스 대용 실제 데이터 수행부

    private final static Member[] members = new Member[10];

    private static int count;

    public static boolean store(Member[] newmembers) {
        for (int i = 0; i < newmembers.length; i++) {
            if (count != 10) {
                members[count++] = newmembers[i];
            } else {
                System.out.println("정원 초과");
                return false;
            }
        }return true;
     }
     public static Member[] findAllMember() {
        return members;
     }

}
