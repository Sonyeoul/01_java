package main.java.section01.method;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 메소드란?
        * 어떤 특정 작업을 수행하기 위한 멍령문의 집합이다.,
        *
        * */
        Application01 app1 = new Application01();
        app1.yaya();
        app1.sec();
        app1.thd();

        int c=app1.plus(1,2);
        System.out.println(c);
        System.out.println("메소드 종료");
    }
    public void yaya(){
        System.out.println("yaya 호출됨");
        System.out.println("yaya 끝남");

    }
    public int plus(int a,int b){
        return a+b;
    }
    public void sec(){

        System.out.println("sec method input");
        System.out.println("sec method out");
    }
    public void  thd(){
        System.out.println("호출됨");
        System.out.println("종료됨");
    }
    public void methodA(){
        System.out.println("호출");
        System.out.println("종료");
        System.out.println("호출");
        System.out.println("종료");


    }
}
