package section05.casting;

public class Application01 {
    public static void main(String[] args) {


        /*
        * 자바에서 다른 타입끼리의 연산은 피 연산자들이 모두 같은 타입이어야 실행가능하다
        * 같은 데이터 타입끼리 연산을 수행할 수 있다
        *
        * 종류 규칙
        *
        *  1.자동형변환 작은 자료형에서 큰 자료형으로 됨
        *  2. 문자형은 int 형으로 변환
        *
        *  강제형변환
        *  cast 연산자를 이용해 강제적으로 변환
        *  자동이 되지않는 경우 강제로 해야햐야한다.
        * */

        int num=10;
        long num1=20l;

        long result = num*num1;
        System.out.println(result);

        long eight = 8l;
        float four = eight;
        System.out.println(four);

        float result1 = eight * four;
        System.out.println(result1);

        char ch1 = '1';
        int chNum = 97;

        char chVal = (char)chNum;
        System.out.println((int)ch1);
        System.out.println(chVal);
        System.out.println((char)chNum);


    }
}
