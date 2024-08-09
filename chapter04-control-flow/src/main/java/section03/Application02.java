package main.java.section03;

public class Application02 {

    public static void main(String[] args) {

        /*
        * 값의 형태 별 기본값
        * 점수 0
        * 실수 0.0
        * 논리 false
        * 문자 \u0000
        * 참조 null
        * 자바에서 기본 값 외의 값으로 초기화를 하고 싶은 경우 블럭을 이용
        * 블럭을 사용하는 경우에는 new 를 사용하지 않아도 되며, 값의 갯수만큼
        * 자동으로 크기가 설정된다.
        * */

        int arr [] = {12,13,13,13,45};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

        String[] arrr= {"t","sds","si","bal"};

        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
    }
}
