package section03.constant;

public class Application01 {
    public static void main(String[] args) {
        //상수값 고정된값
        //초기화 이후값이 수정되지 못하도록한다.

        final int AGE=10;

        System.out.println(AGE);

        //변수의 대입가능
        int sum = AGE;
        sum+=AGE;
        System.out.println(sum);

    }
}
