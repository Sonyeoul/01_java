package main.java.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
        * nextLine() : 공백을 포함한 한 줄을 입력 개행문자 전까지 읽어서 반환
        * next() : 공백문자나 개행문자 전까지 읽어서 반환
        *
        *
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("값을 입력 해주세요 : ");
        String input = in.nextLine();
        System.out.println(input);

        System.out.println("두번째 값 입력해주세요 : ");
        String input2 = in.next();
        System.out.println(input2);
    }
}
