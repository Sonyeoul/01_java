package main.java.section03.dto;

public class MemberDTO {

    private int num;
    private String name;
    public int age;
    private char gender;
    private double height;
    private  boolean isAction;

    /*
    * setter,getter 의 경우 실무에서 암묵적으로 통용되는 규칙이 존재
    * setter 작성규칙
    * 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언
    * 호출당시 전달되는 매개변수의 값을 이용해 필드의 값을 변경
    *
    * getter 작성규칙
    * 필드의 값을 반환 받을 목적의 메소드 집합을 의미한다
    * 각 접근자는 하나의 필드에만 접근하도록 한다
    * 필드에 접근해서 기록된값을 return을 이용하여 반환하며
    * 이 때 변환타입은 반환하려는 값의 자료형과 일치시킨다
    * */

    public boolean isAction() {
        return isAction;
    }

    public void setAction(boolean action) {
        isAction = action;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
