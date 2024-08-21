package main.java.section01.exception;

public class App2 {
    public static void main(String[] args) {
        ExceoptionTest ex = new ExceoptionTest();

        try{
            ex.checkMoney(10000,5000);
            System.out.println("구입 가능");
        }catch (Exception e){
            System.out.println("돈이 부족하다");
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
