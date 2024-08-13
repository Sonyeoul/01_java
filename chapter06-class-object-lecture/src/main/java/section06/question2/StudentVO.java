package main.java.section06.question2;

public class StudentVO {

    private String name;
    private int grade;
    private double height;
    private char gender;
    private int classroom;

    public StudentVO() {
    }
    public StudentVO(String name, int grade, double height, char gender, int classroom) {
        this.name = name;
        this.grade = grade;
        this.height = height;
        this.gender = gender;
        this.classroom = classroom;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public void printInfo() {
        System.out.println("학년 : "+this.grade);
        System.out.println("반 : "+this.classroom);
        System.out.println("이름 : "+this.name);
        System.out.println("키 : "+this.height);
        System.out.println("성별 : "+this.gender);
    }
}
