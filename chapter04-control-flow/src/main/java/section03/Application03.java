package main.java.section03;

import java.util.Scanner;

public class Application03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] score = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"번째 학생의 점수 입력하시오: ");
            score[i] = in.nextInt();
            double sum = 0;
            double avg = 0;
            sum += score[i];
            avg = sum / score[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"번째 학생의 점수는"+score[i]);
        }

    }

}
