package main.java.section.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void dan(){

        for(int a=1; a<10; a++){
            for(int b=1;b<10; b++) {
                System.out.println(a + "*" + b + "=" + a * b);
            }
        }
    }

    public void star(){
        Scanner sc = new Scanner(System.in);
        System.out.println("줄 수를 입력: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public void dystar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("줄 수를 입력");
        int num = sc.nextInt();

        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}