package main.java.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {


        /*
        * 스캐너
        * */
        int a = -43;
        System.out.println(a%2);
        Scanner in = new Scanner(System.in);
        System.out.println("your name input pz : ");

        String name = in.nextLine();
        System.out.println("hi "+name);


    }
}
