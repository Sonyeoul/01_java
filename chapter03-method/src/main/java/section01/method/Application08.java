package main.java.section01.method;

public class Application08 {
    public static void main(String[] args) {
        //다른 클래스 메소드 호출

        //non static 메소드
        //클래스가 다르더라도사용하는 방법은 동일
        Calculater cal = new Calculater();
        int a= 100;
        int b= 200;
        int min = cal.min(a,b);
        System.out.println(min);

        //static 메소드의 경우
        int max = Calculater.max(a,b);
        System.out.println(max);
    }

}
