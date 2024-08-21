package main.java.question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);
    static HashSet<String> studentNums = new HashSet<>();
    static HashSet<Student> studentList = new HashSet<>();
    public static void main(String[] args) {



        while (true) {
            System.out.println("1.학생 추가 2.학년별 학생 목록조회 3.성적 수정 4.학생 정보 삭제");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 : studentAdd(); break; //추가
                case 2 : studentList(); break; //목록조회
                case 3 : break; //성적 수정
                case 4 : break; //삭제
                case 9 : return; //종료
            }

        }
    }
    public static void studentAdd() {
        boolean loop = true;
        while (loop) {

            System.out.println("학년을 입력하시오. (FRESHMAN, SOPHOMORE, JUNIOR, SENIOR): ");
            String grade = sc.nextLine();
            Grade grade1;
            try {
                grade1 = Grade.valueOf(grade.toUpperCase());
            } catch (Exception e) {
                System.out.println("잘못된 학년 입력 다시");
                continue;
            }
            System.out.println("이름을 입력하시오 : ");
            String studentName = sc.nextLine();
            System.out.println("학번을 입력하시오 : ");
            String studentNum = sc.nextLine();
            if (studentNums.contains(studentNum)) {
                System.out.println("중복된 학번입니다. 다른 학번 입력 : ");
                studentNum = sc.nextLine();
            }
            Student student = new Student(studentNum, studentName, grade1);
            studentNums.add(studentNum);
            studentList.add(student);
            System.out.println("학생 등록 완료"+student);
            System.out.println("학생 입력을 더 하시나요? (Y/N)");
            String answer = sc.nextLine();
            if (!answer.equals("Y")) {
                loop = false;
            }
        }
    }

    public static void studentList() {
        System.out.println("어느 학년을 조회하시나요? (FRESHMAN, SOPHOMORE, JUNIOR, SENIOR):");
        String grade = sc.nextLine();
        for(Student student : studentList) {
            if(grade.toUpperCase().equals(student.getGrade())) {
                System.out.println(student);
            }
        }
    }

}