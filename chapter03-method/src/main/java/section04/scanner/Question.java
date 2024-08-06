package main.java.section04.scanner;

import java.util.Random;

public class Question {


    public int random(int r) {
        Random re = new Random();
        int a = re.nextInt(200) - 100;
        return a;
    }

    public void plmi(int rnum1) {

        String a1 = (rnum1 > 0) ? "양수" : "음수";
        String a2 = (Math.abs(rnum1) % 2 == 0) ? "짝수" : "홀수";
        System.out.println(rnum1 + "은 " + a1 + "면서" + a2);
    }
}
