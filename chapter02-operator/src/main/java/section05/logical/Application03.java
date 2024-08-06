package main.java.section05.logical;

public class Application03 {
    public static void main(String[] args) {
        /*
        * and에서 앞에 논리식이 false면 뒤에 연산은 수행하지않는다
        *
        * */
        int a = 10;
        int result = (false && ++a>0) ? a : 20;

        System.out.println(result);


        int result1 = (true || ++a>0) ? a : 20;
        System.out.println(result1);
    }
}
