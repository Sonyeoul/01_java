package main.java.section01.conditional.question;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {


        Question01 q = new Question01();

        Scanner input = new Scanner(System.in);
        System.out.println("수학점수를 입력 : ");
        int math = input.nextInt();
        System.out.println("국어점수를 입력 : ");
        int kor = input.nextInt();
        System.out.println("영어점수를 입력 : ");
        int en = input.nextInt();

        q.avg(math, kor, en);
        q.awr(q.avg(math, kor, en));


    }
    public int avg(int math, int kor, int en) {

        if(math < 40 && kor < 40 && en < 40) {
            System.out.println("불합격입니다");
        }
        int avg = (math + kor + en)/3;
       return avg;
    }
    public void awr (int avg){

            if(avg >= 60) {
                System.out.println("합격입니다");
            }else{
                System.out.println("불합격입니다");
            }
    }
}
