package section05.casting;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리된다.
        *
        * */

        int a=10;
        long b=10l;

        long result = a+b;
        int result2 = a+ (int)b;

        System.out.println(result2);


        byte c=10;
        short d=10;

        short result3 = (short) (c + d);

    }
}
