package main.java.section02.enumType;

public class App {
    public static void main(String[] args) {
        //열거 타입으로 선언된 인스턴스느 싱글톤으로 관리된다

        Sub sub = Sub.JAVA;
        Sub sub2 = Sub.HTML;

        if (sub == sub2) {
            System.out.println("같은과목");
        }else{
            System.out.println("안같은 과목");
        }
        System.out.println(sub==Sub.JAVA);
        System.out.println(sub.JAVA.toString());
        System.out.println(sub.JAVA);

        //values() 를 이용해서 상수값 배열을 반환하고 이를 연속처리할수있다
        Sub[] subs =Sub.values();
        for(Sub s : subs){
            System.out.println(s);
        }
        printsubject(Sub.JAVA);
        //타입 안전성을 보장한다
    }
    public static void printsubject(Sub sub){
        System.out.println(sub.toString());
    }
}
