package main.java.section01.conditional;

import java.util.Scanner;

public class C_elseIf {


    public void tail(){

        Scanner in = new Scanner(System.in);

        System.out.println("어떤 도끼가 너의 도끼냐? (1. 금 2. 은 3. 동) :");
        String num = in.nextLine();
        int num1 = Integer.parseInt(num);
        if(num1==1){
            System.out.println("거짓 꺼지쇼");
        }else if(num1==2){
            System.out.println("은? 꺼지쇼");
        }else if(num1==3){
            System.out.println("가져가쇼");
        }else{
            System.out.println("1,2,3,번중 선택해야함");
        }
        System.out.println("수고요");
    }
    public void scoreCal(){

        Scanner scr = new Scanner(System.in);
        System.out.println("이름입력 : ");
        String name = scr.nextLine();
        System.out.println("점수 입력 : ");
        int score = scr.nextInt();
        char bonus = '+';
        if(score >= 90 ){
            System.out.printf(name + "학생 점수는 A");
            if(score >=95) {
                System.out.println(bonus);
            }
        }else if(score >= 80 ){
            System.out.printf(name + "학생 점수는 B");
            if(score >=85) {
                System.out.println(bonus);
            }
        }else if(score >= 70 ){
            System.out.printf(name + "학생 점수는 C");
            if(score >=75) {
                System.out.println(bonus);
            }
        }else {
            System.out.println(name+"학생 점수는 F");
        }
    }

    public void scoreCal2() {
        Scanner scr = new Scanner(System.in);
        System.out.println("이름입력 : ");
        String name = scr.nextLine();
        System.out.println("점수 입력 : ");
        int score = scr.nextInt();
        String grade="";
        if(score >= 90 ){
           grade =  "A";
            if(score >=95) {
            grade +="+";
            }
        }else if(score >= 80 ){
            grade =  "B";
            if(score >=85) {
                grade +="+";
            }
        }else if(score >= 70 ){
            grade =  "C";
            if(score >=75) {
                 grade +="+";
            }
        }else {
            System.out.println(name+"학생 점수는 F");
        }
        System.out.println(name+"학생의 점수는 "+ grade +"입니다");
    }



}
