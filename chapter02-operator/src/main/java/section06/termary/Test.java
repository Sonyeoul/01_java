package main.java.section06.termary;

public class Test {
    public static void main(String[] args) {


        int en1 = 90;
        int en2 = 96;
        int en3 = 81;

        String avg1 =  (en1 >= 90)? "합격":"불합격";
        String avg2 =  (en2 >= 90)? "합격":"불합격";
        String avg3 =  (en3 >= 90)? "합격":"불합격";


        System.out.println("학생들의 점수 총합은 "+(en1+en2+en3)/3);
        System.out.println("1번 학생은 "+avg1);
        System.out.println("2번 학생은 "+avg2);
        System.out.println("3번 학생은 "+avg3);

        System.out.println("-------------------");

        int height1 = 170;
        int height2 = 110;
        String hi = (height1 >= 120) ? "탑승 가능":"탑승 불가";
        String hi1 = (height2 >= 120) ? "탑승 가능":"탑승 불가";
        System.out.println("탑승가능한 기준은 120cm 입니다. "+height1+"cm 이므로 "+hi);
        System.out.println("탑승가능한 기준은 120cm 입니다. "+height2+"cm 이므로 "+hi1);
    }
}
