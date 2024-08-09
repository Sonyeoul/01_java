package main.java.section.looping;

import java.util.Scanner;

public class C_while {

    public void testwhile(){

        int i =1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }


    public void testex(){

        Scanner sc = new Scanner(System.in);
        System.out.println("단어입력 : ");
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++) {
            char a = s.charAt(i);
            System.out.println(a);
        }
        System.out.println("-----------------");
        int index=0;
        while(index < s.length()){
            char a = s.charAt(index);
            System.out.println(a);
            index++;
        }
    }


    public void testex1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 :");
        int num = sc.nextInt();
        int count=0;
        int sum=0;
        while(count < num){
            sum+=count;
            count++;
            System.out.println(sum);


        }
    }
}
