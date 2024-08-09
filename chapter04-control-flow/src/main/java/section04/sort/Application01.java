package main.java.section04.sort;

public class Application01 {
    public static void main(String[] args) {

        //변수 , 배열의 값을 바꾸는 방법

        //변수 두값 변경
        int num1 = 10;
        int num2 = 20;

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);

        int[] arr = {1, 2, 3};
        int temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
