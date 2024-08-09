package main.java.section02.demantional;

public class Application02 {
    public static void main(String[] args) {

        /*2차원 배열도 선언과 할당을  동시에 할 수 있다
        1.정변 배열 : 배열의 길이가 똑같은것
        2.가변 배열 : 배열의 길이가 다른것
         */
        int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
