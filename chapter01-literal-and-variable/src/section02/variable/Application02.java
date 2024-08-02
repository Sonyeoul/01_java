package section02.variable;

public class Application02 {
    public static void main(String[] args) {
        //변수 선언 - 초기화 - 응용
        //변수의 자료형은 문자,열,숫자,논리형, 참조형으로 나뉜다

        //자바는 기본적으로 데이터의 최소단위를 1byte만큼 취급한다.
        byte bnum = -11;
        short snum = 2;
        int inum = -3;
        long lnum = 4l;

        float fnum = 0.1F;
        double dnum = 0.2;
        char ch = 'a';
        System.out.println((char) 97);
        System.out.println(lnum);
        boolean tf = true;


        String str = "배고푸다";
        //데이터형에 알맞게 변수 초기화하기

        System.out.println(bnum + "" + snum + inum + lnum + fnum + dnum + ch);
        System.out.println(tf + str);

        int point = 100;
        System.out.println(point);
        point += 100;
        System.out.println(point);
    }
}
