package main.java.section02.demantional;

public class Application01 {

    public static void main(String[] args) {

        /*다차원 배열
        2차원 이상 배열을 의미
        배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미


        */
        int arr[][]=new int[3][5];

        for (int i =0;i<arr[0].length;i++){
            System.out.print(arr[0][i]);
        }
        System.out.println();
        for (int i =0;i<arr[1].length;i++){
            System.out.print(arr[1][i]);
        }
        System.out.println();
        for (int i =0;i<arr[2].length;i++){
            System.out.print(arr[2][i]);
        }
    }
}
