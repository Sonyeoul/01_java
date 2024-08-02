package section05.casting;

public class Question {
    public static void main(String[] args) {

        // 178.5 178.3 188.67 160.8 190.7
        float a = 178.5f;
        float b = 178.3f;
        float c = 188.67f;
        float d = 160.8f;
        float e = 190.7f;

        double result = (a+b+c+d+e)/5;

        System.out.println(result);
        System.out.println((int)result);

        //이번달 매출에서 부가세를 제외한 소득을 알고싶다
        // 매출 150400 1400 25000 30000

        int aa = 150400;
        int bb = 1400;
        int cc = 25000;
        int dd = 30000;
        int sum = aa+bb+cc+dd;
        double avg = sum*0.1;
        System.out.println(
                "총 매출액은 "+sum+"입니다");
        System.out.println("부과세를 제외한 소득은 "+(int)(sum-avg)+"이고 부가세는"+(int)avg+" 입니다");






    }
}
