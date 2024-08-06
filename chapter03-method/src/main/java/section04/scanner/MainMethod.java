package main.java.section04.scanner;

public class MainMethod {
    public static void main(String[] args) {

        Question ques = new Question();
        int rnum = ques.random(100);
        System.out.println(rnum);
        ques.plmi(rnum);

    }
}
