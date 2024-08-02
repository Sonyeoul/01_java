package main.java.section03.increment;

public class Application {
    public static void main(String[] args) {

        /*
        * 증감연산자
        *  ++a , a++; 증가
        *  --a , a--; 감소
        *
        *
        * */

        int num =10;
        int num1 = 20;
        int result = 0;

        result = result * ++num;
        System.out.println(result);
        result = result + num++;
        System.out.println(result);
        
        result = 1;
        result = result * num++;
        System.out.println(result);


    }
}
