package main.java.section.looping;

import java.util.Scanner;

public class A_for {

    //반복문 for(i=n;i<n;i++)
    public void loop(){

        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }

    public void exam(){

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자 입력");
        int num2 = sc.nextInt();
        int sum = 0;

        for(int i=num1; i<num2; i++){

            sum+=i;
            System.out.println(sum);
        }
    }

    public void sosu(){

        Scanner sc = new Scanner(System.in);
        System.out.println("시작숫자: ");
        int num1 = sc.nextInt();
        System.out.println("끝 숫자: ");
        int num2 = sc.nextInt();

        for(int i=num1; i<=num2; i++) {

            boolean is = true;
            for(int j =2; j<i; j++){
                if(i%j==0){
                    is=false;
                    break;
                }
            }
            if(is==true){
                System.out.println(i);
            }
        }
    }
//if( i%2 !=0 && i%3 !=0 && i%5 !=0 && i%7 !=0){
//                    System.out.println(i);
//                }


}
