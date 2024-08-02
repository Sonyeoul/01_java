package section03.constant;

public class Application02 {
    public static void main(String[] args) {
        //상소의 이름명은 대문자 혹은 숫자만 사용한다
        //단어와 단어는 언더스코어 사용
        final int AGE1 = 19;
        final int AGE2 = 20;

        byte MAX_AGE = 127;
        MAX_AGE++;
        System.out.println(MAX_AGE);

        byte min = -128;
        min--;
        System.out.println(min);

        int fN=10000000;
        int sN=700000;
        long mN=(long)fN*sN;
        System.out.println(mN);
    }
}
