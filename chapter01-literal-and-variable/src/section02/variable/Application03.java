package section02.variable;

import java.lang.reflect.Array;

public class Application03 {
    public static void main(String[] args) {
        //변수 명명
        //앞에숫자X 앞에 대소문자구별  언더바만 의미전달이 쉬워야함
        //예약어 사용X
        //논리형은 의문문으로 가급적 긍정형으로 네이밍한다

        int kim = 100;
        int yoo = 120;
        int lim = 130;
        int bu = 150;
        double bonus = 0.5;



        System.out.printf("김씨 월급은 %d + 보너스는 %d 만원으로 총 %d 이다 \n", kim, (int)(kim * bonus),(int)(kim * bonus+kim));
        System.out.printf("유씨 월급은 %d + 보너스는 %d 만원으로 총 %d 이다 \n", yoo, (int)(yoo * bonus),(int)(yoo * bonus+yoo));
        System.out.printf("임씨 월급은 %d + 보너스는 %d 만원으로 총 %d 이다 \n", lim, (int)(lim * bonus),(int)(lim * bonus+lim));
        System.out.printf("부씨 월급은 %d + 보너스는 %d 만원으로 총 %d 이다 \n", bu, (int)(bu * bonus),(int)(bu * bonus+bu));

        System.out.println("김씨 월급은 "+kim+" 보너스는 "+(int)(kim * bonus)+" 총 "+(int)(kim * bonus+kim)+"이다");

        }
}


