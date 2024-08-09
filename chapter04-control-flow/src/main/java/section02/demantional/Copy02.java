package main.java.section02.demantional;

import java.util.Arrays;

public class Copy02 {

    public static void main(String[] args) {

        /*
        * 깊은 복사를 하는방법
        * 1.for 문을 이용한 동일 인덱스값 복사
        * 2. 오브젝트 의 클론을 이용한 복사
        * 3. 시스템의 arrayCopy를 이용
        * 4. Array의 copyOf 이용한 복사
        *
        * */
    }
    public static void print(int[] iarr){

        for (int i=0 ; i<iarr.length ; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static void copy() {

        int[] originArr={1,2,3,4,5};
        int[] copyArr1 = new int [10];
        for(int i=0 ; i<copyArr1.length ; i++) {
            copyArr1[i]=originArr[i];
        }
        //클론으로 복사
        print(copyArr1); //그저 똑같음
        System.out.println("클론");
        int[] copyArr2 = originArr.clone();
        print(copyArr2);

        //System 의 arraycopy (원본 배열의 인덱스값 범위값만 복사할수있음
        System.out.println("arraycopy");
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr,0,copyArr3,3,originArr.length);
        //4.arrayscopyOf를 이용한 복사 (길이를 더 늘릴수있음
        int[] copyArr4 = Arrays.copyOf(originArr,originArr.length);

    }

}
