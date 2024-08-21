package main.java.section.intEnum;

public class App {
    public static void main(String[] args) {
        //정수 열거 패턴의 단점
    int subject1 = Subject.JAVA;
    int subject2 = Subject2.HTML;

    //정수 값만 가지고 있는 필드
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다");
        }
        int num =0;
        String subName = "";
        switch (num) {
            case Subject.JAVA: subName = "Java"; break;
            case Subject.ORACLE: subName = "ORCLE"; break;
            case Subject.JSP: subName = "JSP"; break;
        }
        System.out.println(subName);

        printSub(2);
        printSub(Subject2.HTML);
    }

    public static void printSub(int subjectNum){
        String subName = "";
        switch (subjectNum) {
            case Subject.JAVA: subName = "Java"; break;
            case Subject.ORACLE: subName = "ORCLE"; break;
            case Subject.JSP: subName = "JSP"; break;
        }
        System.out.println(subName);
    }
}
