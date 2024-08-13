package main.java.section06.question2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("학년 : ");
        int grade = input.nextInt();
        System.out.println("반 : ");
        int classroom = input.nextInt();
        System.out.println("이름 : ");
        String name = input.next();
        System.out.println("키 : ");
        double height = input.nextDouble();
        System.out.println("성별 : ");
        char gender = input.next().charAt(0);
        StudentVO st = new StudentVO(name,grade,height,gender,classroom);

        st.printInfo();

    }


}
