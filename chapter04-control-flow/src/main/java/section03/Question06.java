package main.java.section03;

import java.util.Arrays;
import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하시오 : ");
        int num = in.nextInt();
        int[] aar = new int[num];
        int[] arr = new int[num];
        System.out.println();
        for (int i = 0; i < aar.length; i++) { //배열에 벨류값 넣고
            System.out.println("배열의 정수를 입력하시오: ");
            aar[i] = in.nextInt();
        }
        Arrays.sort(aar);

        for (int i = 0; i < aar.length; i++) {
            if (i == 0 || aar[i] != aar[i - 1]) {
                arr[i] = aar[i];
                System.out.println(arr[i]);
            }
        }
    }
}
