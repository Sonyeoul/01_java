package main.java.section04.scanner;
import java.util.Scanner;
public class Calcul {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("첫번째 값을 입력 :");
        int a = in.nextInt();
        System.out.println("+ - * / % 무슨 연산을 하시나요 :");
        char giho = in.next().charAt(0);
        System.out.println("두번째 값을 입력 :");
        int b = in.nextInt();

        if(giho ==43){
            int c= a+b;
            System.out.println("첫번째 값 + 두번째 값 ="+c);
        } else if (giho==45) {
            int c= a-b;
            System.out.println("첫번째 값 - 두번째 값 ="+c);
        } else if (giho==42) {
            int c= a*b;
            System.out.println("첫번째 값 * 두번째 값 ="+c);
        } else if (giho==47) {
            int c= a/b;
            System.out.println("첫번째 값 / 두번째 값 ="+c);
        } else if (giho==37) {
            int c =a%b;
            System.out.println("첫번째 값 % 두번째 값 ="+c);
        }



    }

}
