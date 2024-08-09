package main.java.section03;

import java.util.Scanner;

public class Question05 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("배열의 길이를 입력하시오. :");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("배열안에 정수를 입력하시오: ");
            arr[i]= in.nextInt();
        }
        int max = arr[0];
        int secmax= arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int j = 1; j < arr.length; j++) {
            if(arr[j] > secmax && arr[j] < max){
                secmax = arr[j];
            }
        }

        System.out.println("입력한 정수중 가장 큰값은 "+max+" 이다");
        System.out.println("입력한 정수중 두번째로 큰값은 "+secmax+" 이다");
    }
}
