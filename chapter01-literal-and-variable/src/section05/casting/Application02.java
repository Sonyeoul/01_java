package section05.casting;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 강제 형변환
        * 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요
        * 실수 > 정수
        * 문자형 > 정수
        * 논리형은 제외
        * */

        long lnum = 8l;
        int inum = (int)lnum;
        short sum = (short)inum;
        byte bnum = (byte)sum;
        System.out.println(bnum);

        float fnum = 8.1f;
        int i = (int) fnum;

        System.out.println(i);

        char ch= 'a';
        int i1 = ch;
        byte bnum2 = (byte)ch;
    }
}
